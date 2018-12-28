package lkj.spring3.file.drag_drop.model;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import lkj.spring3.file.controller.Path;

@Service
public class DragdropServiceImpl implements DragdropService{
	private MultipartHttpServletRequest multipartRequest;
	private Map<String, List<String>> map;
	private String fileStore =Path.FILE_STORE;
	
	@Override
	public Map<String, List<String>> getUpdateFileName() {
		upload();
		return map;
	}

	public MultipartHttpServletRequest getMultipartRequest() {
		return multipartRequest;
	}

	public void setMultipartRequest(MultipartHttpServletRequest multipartRequest) {
		this.multipartRequest = multipartRequest;
	}
	private void upload() {
		map=new Hashtable<String, List<String>>();
		
		Iterator<String> itr=multipartRequest.getFileNames();
		List<String> oNames=new ArrayList<String>();
		List<String> saveNames=new ArrayList<String>();
		StringBuffer sb=null;
		while(itr.hasNext()) {
			MultipartFile mpf=multipartRequest.getFile(itr.next());
			sb = new StringBuffer();
			String oFilename=mpf.getOriginalFilename(); //파일명
			String saveFilename=sb.append(new SimpleDateFormat("yyyyMMddhhmmss").format(System.currentTimeMillis()))
					.append(UUID.randomUUID().toString())
					.append(oFilename.substring(oFilename.lastIndexOf("."))).toString();
			System.out.println(oFilename);
			System.out.println(saveFilename);
			
			String fileFullPath=fileStore+"/"+saveFilename; //저장파일 전체 경로
			try {
				mpf.transferTo(new File(fileFullPath));
				oNames.add(oFilename);
				saveNames.add(saveFilename);
			}catch(IOException ie) {
				System.out.println("DragdropServiceImpl upload() ie: "+ie);
			}
		}
		map.put("oNames",oNames);
		map.put("saveNames",saveNames);
	}
	

}
