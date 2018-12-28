package lkj.spring3.file.model.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import lkj.spring3.file.controller.Path;
import lkj.spring3.model.FileDTO;
import java.io.File;


@Service
public class FileServiceImpl implements FileService{

	@Override
	public boolean upload(FileDTO dto) {
		File fStroe=new File(Path.FILE_STORE);
		if(! fStroe.exists()) fStroe.mkdirs();
		
		MultipartFile mfile=dto.getUploadfile();
		String oFileName=mfile.getOriginalFilename();
		String saveFileName= oFileName;
			
		if(saveFileName !=null) {
			saveFileName=saveFileName.trim();
			if(saveFileName.length()!=0) {
				if(new File(Path.FILE_STORE,saveFileName).exists()) {
					int idx=saveFileName.lastIndexOf(".");
					String fName=saveFileName.substring(0, idx);
					String fExt=saveFileName.substring(idx+1);
					
					saveFileName=fName+"_"+System.currentTimeMillis()+"."+fExt;
				}
				try {
					mfile.transferTo(new File(Path.FILE_STORE,saveFileName));
					return true;
				}catch (Exception e) {
					return false;
				}
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}

}
