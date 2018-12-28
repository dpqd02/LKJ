package lkj.spring3.page.model.dao;

import java.util.List;
import lkj.spring3.model.Paging;
import lkj.spring3.page.vo.PagingVo;

public interface PagingDAO {
	List<Paging> select(PagingVo pagingVo);
	Paging select(long seq);
	long selectCount();
	
	boolean insert(Paging paging);
	boolean delete(long seq);
	void deleteAll();
}
