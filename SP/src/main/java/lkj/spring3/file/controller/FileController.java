package lkj.spring3.file.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import lkj.spring3.file.model.service.FileService;
import lkj.spring3.model.FileDTO;

@Controller
@RequestMapping("file")
public class FileController {
	
	@RequestMapping("list.do")
	public ModelAndView list() {
		ModelAndView mv= new ModelAndView("file/list");
		return mv;
	}
	@RequestMapping(value="write.do" ,method=RequestMethod.GET)
	public String write() {
		return "file/write";
	}
	
	@Autowired
	private FileService service;
	
	@RequestMapping(value="write.do" ,method=RequestMethod.POST)
	public ModelAndView write(FileDTO dto) {
		boolean result=service.upload(dto);
		
		return new ModelAndView("file/result_msg","result",result);		
	}
	
	@RequestMapping("download.do")
	public ModelAndView download(String fname) {
		File file=new File(Path.FILE_STORE, fname);
		if(file.exists()) {
			return new ModelAndView("fileDownloadView","downloadFile",file);
		}else {
			return  new ModelAndView("redirect:list.do");
		}
	}
	
	@RequestMapping("del.do")
	public String delete(String fname) {
		File file=new File(Path.FILE_STORE, fname);
		if(file.exists()) {
			file.delete();
		}
		
		return "redirect:list.do";
	}
}
