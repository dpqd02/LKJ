package lkj.spring3.board2.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import lkj.spring3.board2.model.service.BoardService2;
import lkj.spring3.board2.vo.ListResult;
import lkj.spring3.model.Board2;

@Controller
@RequestMapping("board2")
public class BoardController2 {
	@Autowired
	private BoardService2 service;
	
	@RequestMapping("list.do")
	public ModelAndView list(HttpSession session,HttpServletRequest request) {
		String cpStr=request.getParameter("cp");
		String psStr=request.getParameter("ps");
		int cp=1;
		int ps=3;
		
		//cp
		if(cpStr==null) {
			cpStr="1";
			Object cpObj=session.getAttribute("cp");
			if(cpObj!=null) {
				cp=(Integer)cpObj;
			}
		}else {
			cpStr=cpStr.trim();
			cp=Integer.parseInt(cpStr);
		}
		session.setAttribute("cp", cp);
		
		//ps
		if(psStr==null) {
			psStr="3";
			Object psObj=session.getAttribute("ps");
			if(psObj!=null) {
				ps=(Integer)psObj;
			}
		}else{
			psStr=psStr.trim();
			int psParam=Integer.parseInt(psStr);
			
			Object psObj=session.getAttribute("ps");
			if(psObj != null) {
				int psSession=(Integer)psObj;
				if(psSession!=psParam) {
					cp=1;
					session.setAttribute("cp", cp);
				}
			}else {
				if(ps!=psParam) {
					cp=1;
					session.setAttribute("cp", cp);
				}
			}
			ps=psParam;
		}
		session.setAttribute("ps", ps);
		
		//Modelview
		ListResult listResult=service.getListResult(cp, ps);
		ModelAndView mv=new ModelAndView("board2/list","listResult", listResult);
		if(listResult.getList().size()==0) {
			if(cp>1) {
				return new ModelAndView("redirect:list.do?cp="+(cp-1));
			}
		}
		return mv;
	}
	@RequestMapping(value="write.do" ,method=RequestMethod.GET)
	public String write() {
		return "board2/write";
	}
	@RequestMapping(value="write.do" ,method=RequestMethod.POST)
	public String write(Board2 board) {
		service.write(board);
		return "redirect:list.do?cp=1";
	}
	@RequestMapping(value="content.do" ,method=RequestMethod.GET)
	public ModelAndView content(long seq) {
		Board2 board=service.getBoard(seq);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board2/content");
		mv.addObject("board", board);
		return mv;
	}
	@RequestMapping(value="del.do" ,method=RequestMethod.GET)
	public String delete(long seq) {
		service.remove(seq);
		return "redirect:list.do";
	}
	@RequestMapping(value="edit.do" , method=RequestMethod.GET)
	public ModelAndView update(long seq) {
		Board2 board=service.getBoard(seq);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("board2/edit");
		mv.addObject("board", board);
		
		return mv;
	}
	@RequestMapping(value="edit.do" , method=RequestMethod.POST)
	public String update(Board2 board){
		service.edit(board);
		return "redirect:content.do?seq="+board.getSeq();
	}
}
