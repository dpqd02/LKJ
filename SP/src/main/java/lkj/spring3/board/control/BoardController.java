package lkj.spring3.board.control;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import lkj.spring3.board.service.BoardService;
import lkj.spring3.model.Board;

@Controller
@RequestMapping("board")
public class BoardController {
	@Autowired
	private BoardService service;
	
	@RequestMapping("list.do")
	public ModelAndView list() {
		List<Board> list=service.listService();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board/list");
		mv.addObject("list", list);
		return mv;
	}
	@RequestMapping(value="write.do" ,method=RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	@RequestMapping(value="write.do" ,method=RequestMethod.POST)
	public String write(Board board) {
		service.insertService(board);
		return "redirect:list.do";
	}
	@RequestMapping(value="content.do" ,method=RequestMethod.GET)
	public ModelAndView content(long seq) {
		Board board=service.contentService(seq);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board/content");
		mv.addObject("board", board);
		return mv;
	}
	@RequestMapping(value="delete.do" ,method=RequestMethod.GET)
	public String delete(long seq) {
		service.deleteService(seq);
		return "redirect:list.do";
	}
	@RequestMapping(value="update.do" , method=RequestMethod.GET)
	public ModelAndView update(long seq) {
		Board board=service.contentService(seq);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board/update");
		mv.addObject("board", board);
		
		return mv;
	}
	@RequestMapping(value="update.do" , method=RequestMethod.POST)
	public String update(Board board){
		service.updateService(board);
		return "redirect:content.do?seq="+board.getSeq();
	}
}
