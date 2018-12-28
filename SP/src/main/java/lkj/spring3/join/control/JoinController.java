package lkj.spring3.join.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("join")
public class JoinController {
	
	@RequestMapping("join.do")
	public String joinForm() {
		return "joinform";
	}
}
