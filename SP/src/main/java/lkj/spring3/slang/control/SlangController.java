package lkj.spring3.slang.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lkj.spring3.model.Slang_Board;
import lkj.spring3.slang.model.service.SlangService;


@Controller
@RequestMapping("slang")
public class SlangController {
	@Autowired
	private SlangService service;
	
	@RequestMapping("/")
	public String getMain() {
		return "slang/slindex";
	}
	
	@RequestMapping(value="everySlang.do" , method=RequestMethod.GET)
	public ModelAndView list(){
		List<Slang_Board> list=service.selectService();
		ModelAndView mv=new ModelAndView("slang/slist");
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value="saySlang.do" , method=RequestMethod.GET)
	public String write(){
		return "slang/sform";
	}
}
