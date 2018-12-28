package lkj.spring3.addr.ajax.model.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lkj.spring3.addr.ajax.model.service.AddrService;
import lkj.spring3.model.Address;

@Controller
@RequestMapping("ajax01")
public class AjaxT01Controller {
	
	@Autowired
	private AddrService service;
	
	@RequestMapping(value="search01.do" ,method=RequestMethod.GET)
	public void search01(long seq, HttpServletResponse response) {
		Address address= service.selectService(seq);
		
		String addressJson ="null";
		if(address != null) {
			addressJson= "{"
			+"\"seq\":\""+address.getSeq()+"\","+
			"\"name\":\""+address.getName()+"\","+
			"\"addr\":\""+address.getAddr()+"\","+
			"\"rdate\":\""+address.getRdate()+"\""+
			"}";
		}
		try {
			response.setContentType("application/json;charset=utf-8");
			PrintWriter pw=response.getWriter();
			pw.println(addressJson);
		}catch(IOException ie) {}
	}
	
	@RequestMapping(value="search02.do" ,method=RequestMethod.POST)
	public void search02(String name, HttpServletResponse response) {
		name="%"+name+"%";
		List<Address> list=service.selectService(name);
		String addressJson="null";
		if(list.size()!=0) {
			for(int i=0; i<list.size(); i++) {
				if(i==0) addressJson="[";
				addressJson+= "{"
						+"\"seq\":\""+list.get(i).getSeq()+"\","+
						"\"name\":\""+list.get(i).getName()+"\","+
						"\"addr\":\""+list.get(i).getAddr()+"\","+
						"\"rdate\":\""+list.get(i).getRdate()+"\"";
				if(i==list.size()-1) addressJson+="}]";
				else addressJson+="},";
			}
		}else {
			addressJson="[]";
		}
		try {
			response.setContentType("application/json;charset=utf-8");
			PrintWriter pw=response.getWriter();
			pw.println(addressJson);
		}catch(IOException ie) {}
	}
}
