package lkj.spring3.page.model.service;

import java.util.List;
import lkj.spring3.model.Paging;
import lkj.spring3.page.vo.PagingVo;

public interface PagingService {
	List<Paging> selectService(PagingVo pagingVo);
	Paging selectService(long seq);
	long selectCountService();
	
	boolean insertService(Paging paging);
	boolean deleteService(long seq);
	void deleteAllService();
}
