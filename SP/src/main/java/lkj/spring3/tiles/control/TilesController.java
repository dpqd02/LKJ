package lkj.spring3.tiles.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	
	@RequestMapping("/")
	public String welcome() {
		return "index2";
	}
	@RequestMapping("index.do")
	public String home() {
		return "index2";
	}
	@RequestMapping("list.do")
	public String list() {
		return "boardList";
	}
	@RequestMapping("content.do")
	public String content() {
		return "boardContent";
	}
}
