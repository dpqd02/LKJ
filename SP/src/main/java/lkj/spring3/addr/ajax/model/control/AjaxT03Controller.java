package lkj.spring3.addr.ajax.model.control;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lkj.spring3.addr.ajax.model.service.AddrService;
import lkj.spring3.model.Address;

@Controller
@RequestMapping("ajax03")
public class AjaxT03Controller {
	
	@Autowired
	private AddrService service;
	
	@RequestMapping(value="search01.do" ,method=RequestMethod.GET)
	public @ResponseBody Address search01(long seq, HttpServletResponse response) {
		Address address= service.selectService(seq);
		
		return address;
	}
	
	@RequestMapping(value="search02.do" ,method=RequestMethod.POST)
	public @ResponseBody List<Address> search02(String name, HttpServletResponse response) {
		name="%"+name+"%";
		List<Address> list=service.selectService(name);
		
		return list;
	}
}
