package lkj.spring3.addr.ajax.model.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ajax")
public class AjaxIndexController {
	
	@RequestMapping("test01.do")
	public String t01(){
		return "ajax/test01";
	}
	@RequestMapping("test02.do")
	public String t02(){
		return "ajax/test02";
	}
	@RequestMapping("test03.do")
	public String t03(){
		return "ajax/test03";
	}
	
}
