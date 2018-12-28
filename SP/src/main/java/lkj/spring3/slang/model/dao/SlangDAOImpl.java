package lkj.spring3.slang.model.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lkj.spring3.model.Slang_Board;

@Repository
public class SlangDAOImpl implements SlangDAO{
	@Autowired
	private SqlSession sqlSession;
	private String ns="lkj.spring3.model.Slang";
	
	@Override
	public List<Slang_Board> select() {
		return sqlSession.selectList(ns+".list");
	}

	@Override
	public Slang_Board select(long seq) {
		return sqlSession.selectOne(ns+".content", seq);
	}

}
