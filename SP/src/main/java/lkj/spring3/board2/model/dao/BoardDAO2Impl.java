package lkj.spring3.board2.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lkj.spring3.model.Board2;

@Repository
public class BoardDAO2Impl implements BoardDAO2 {
	
	@Autowired
	private SqlSession sqlSession;
	private String ns="lkj.spring3.model.Board2";
	
	@Override
	public List<Board2> select(int page, int pageSize) {
		int startRow=(page-1)*pageSize;
		int endRow=page*pageSize;
		Map<String, Integer> paramMap= new HashMap<String, Integer>();
		paramMap.put("startRow", startRow);
		paramMap.put("endRow", endRow);
		
		return sqlSession.selectList(ns+".selectPerPage", paramMap);
	}

	@Override
	public long selectCount() {
		return sqlSession.selectOne(ns+".selectCount");
	}

	@Override
	public Board2 select(long seq) {
		return sqlSession.selectOne(ns+".selectBySeq", seq);
	}

	@Override
	public void insert(Board2 board) {
		sqlSession.insert(ns+".insert", board);
	}

	@Override
	public void update(Board2 board) {
		sqlSession.update(ns+".update", board);
	}

	@Override
	public void delete(long seq) {
		sqlSession.delete(ns+".delete", seq);
	}

}
