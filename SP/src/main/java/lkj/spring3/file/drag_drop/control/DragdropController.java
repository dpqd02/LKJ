package lkj.spring3.file.drag_drop.control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import lkj.spring3.file.controller.Path;
import lkj.spring3.file.drag_drop.model.DragdropService;

@Controller
@RequestMapping("drag_drop")
public class DragdropController {
	
	@RequestMapping("write_dd.do")
	public String form() {
		return "drag_drop/write_dd";
	}

	@Autowired
	private DragdropService service;
	
	@RequestMapping(value="fileUpload.do", method=RequestMethod.POST)
	public String fileUpload(MultipartHttpServletRequest multipartRequest) {
		service.setMultipartRequest(multipartRequest);
		Map<String, List<String>> map=service.getUpdateFileName();
		
		String appendData=multipartRequest.getParameter("temp");
		System.out.println("appendData : "+appendData);
		System.out.println("fileNames : "+map);
		
		return "redirect:file/list.do";
	}
}
