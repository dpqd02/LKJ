package lkj.spring3.page.model.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lkj.spring3.model.Paging;
import lkj.spring3.page.vo.PagingVo;

@Repository
public class PagingDAOImpl implements PagingDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String ns="lkj.spring3.model.Paging";
	
	@Override
	public List<Paging> select(PagingVo pagingVo) {
		return sqlSession.selectList(ns+".selectPaging", pagingVo);
	}
	@Override
	public Paging select(long seq) {
		return sqlSession.selectOne(ns+".selectBySeq",seq);
	}
	@Override
	public long selectCount() {
		return sqlSession.selectOne(ns+".selectCount");
	}

	@Override
	public boolean insert(Paging paging) {
		return sqlSession.insert(ns+".insert", paging)==1?true:false;
	}

	@Override
	public boolean delete(long seq) {
		return sqlSession.delete(ns+".delete", seq)==1?true:false;
	}

	@Override
	public void deleteAll() {
		sqlSession.delete(ns+".deleteAll");
	}

}
