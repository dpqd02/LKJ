package lkj.spring3.page.model.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lkj.spring3.model.Paging;
import lkj.spring3.page.model.dao.PagingDAO;
import lkj.spring3.page.vo.PagingVo;

@Service
public class PagingServiceImpl implements PagingService{
	
	@Autowired
	private PagingDAO dao;
	
	@Override
	public List<Paging> selectService(PagingVo pagingVo) {
		return dao.select(pagingVo);
	}

	@Override
	public Paging selectService(long seq) {
		return dao.select(seq);
	}

	@Override
	public long selectCountService() {
		return dao.selectCount();
	}

	@Override
	public boolean insertService(Paging paging) {
		return dao.insert(paging);
	}

	@Override
	public boolean deleteService(long seq) {
		return dao.delete(seq);
	}

	@Override
	public void deleteAllService() {
		dao.deleteAll();
	}

}
