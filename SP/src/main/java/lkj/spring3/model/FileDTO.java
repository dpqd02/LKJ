package lkj.spring3.model;

import org.springframework.web.multipart.MultipartFile;

public class FileDTO {
	
	private MultipartFile uploadfile;
	
	public FileDTO() {}
	public FileDTO(MultipartFile uploadfile) {
		this.uploadfile=uploadfile;
	}
	public MultipartFile getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(MultipartFile uploadfile) {
		this.uploadfile = uploadfile;
	}
	
	
}
