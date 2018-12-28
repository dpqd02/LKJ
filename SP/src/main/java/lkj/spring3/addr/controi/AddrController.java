package lkj.spring3.addr.controi;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import lkj.spring3.addr.service.AddrService;
import lkj.spring3.model.Address;

@Controller
public class AddrController {
	/*@RequestMapping(value = "/addr", method = RequestMethod.GET)
	public String address() {
		return "addr/address";
	}*/
	//@Autowired
	@Resource(name="addrService")
	private AddrService service;
	
	//@RequestMapping(value = "/addr/list.do", method = RequestMethod.GET)
	@RequestMapping("addr/list.do")
	public ModelAndView list() {
		List<Address> list=service.listService();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("addr/list");
		mv.addObject("list", list);
		//ModelAndView mv=new ModelAndView("addr/list","list", list);
		
		return mv;
	}
	@RequestMapping(value = "addr/input.do", method = RequestMethod.GET)
	public String input() {
		return "addr/input";
	}
	@RequestMapping(value = "addr/input.do", method = RequestMethod.POST)
	public String input(Address address) {
		service.insertService(address);
		return "redirect:list.do";
	}
	@RequestMapping("addr/delete.do")
	public String delete(@RequestParam("seq") long seq) {
		service.deleteService(seq);
		return "redirect:list.do";
	}
}
