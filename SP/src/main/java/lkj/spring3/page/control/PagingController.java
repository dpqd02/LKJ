package lkj.spring3.page.control;


import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import lkj.spring3.model.Paging;
import lkj.spring3.page.model.service.PagingService;
import lkj.spring3.page.vo.PagingVo;

@Controller
@RequestMapping("paging")
public class PagingController {
	
	@Autowired
	private PagingService service;
	
	@RequestMapping("list.do")
	public ModelAndView list(PagingVo pagingVo) {
		List<Paging> list=service.selectService(pagingVo);
		long totalCount=service.selectCountService();
		pagingVo.setTotal(totalCount);
		
		ModelAndView mv=new ModelAndView("paging/list");
		mv.addObject("list", list);
		mv.addObject("p", pagingVo);
		return mv;
	}
	
	private Random r=new Random();
	
	@RequestMapping(value="write.do" ,method=RequestMethod.GET)
	public String write(int num) {
		
		for(int i=0;i<num; i++) {
			Paging paging=new Paging(-1, "Á¦¸ñ:"+r.nextInt(1000000000) ,null);
			
			service.insertService(paging);
		}
		return "redirect:list.do";
	}
	
	@RequestMapping(value="del.do" ,method=RequestMethod.GET)
	public String delete(long seq) {
		service.deleteService(seq);
		return "redirect:list.do";
	}
	@RequestMapping(value="delAll.do" ,method=RequestMethod.GET)
	public String delete() {
		service.deleteAllService();
		return "redirect:list.do";
	}
}
