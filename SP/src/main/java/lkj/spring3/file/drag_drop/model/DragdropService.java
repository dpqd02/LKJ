package lkj.spring3.file.drag_drop.model;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface DragdropService {
	Map<String, List<String>> getUpdateFileName();
	MultipartHttpServletRequest getMultipartRequest();
	void setMultipartRequest(MultipartHttpServletRequest multipartRequest);
}
