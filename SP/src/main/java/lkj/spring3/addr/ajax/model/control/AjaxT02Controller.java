package lkj.spring3.addr.ajax.model.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lkj.spring3.addr.ajax.model.service.AddrService;
import lkj.spring3.model.Address;

@Controller
@RequestMapping("ajax02")
public class AjaxT02Controller {
	
	@Autowired
	private AddrService service;
	
	@RequestMapping(value="search01.do" ,method=RequestMethod.GET)
	public void search01(long seq, HttpServletResponse response) {
		Address address= service.selectService(seq);
		ObjectMapper om= new ObjectMapper();
			
		try {
			String result=om.writeValueAsString(address);
			
			response.setContentType("application/json;charset=utf-8");
			PrintWriter pw=response.getWriter();
			pw.println(result);
		}catch(IOException ie) {}
	}
	
	@RequestMapping(value="search02.do" ,method=RequestMethod.POST)
	public void search02(String name, HttpServletResponse response) {
		name="%"+name+"%";
		List<Address> list=service.selectService(name);
		ObjectMapper om= new ObjectMapper();
		
		try {
			String result=om.writeValueAsString(list);
			
			response.setContentType("application/json;charset=utf-8");
			PrintWriter pw=response.getWriter();
			pw.println(result);
		}catch(IOException ie) {}
	}
}
