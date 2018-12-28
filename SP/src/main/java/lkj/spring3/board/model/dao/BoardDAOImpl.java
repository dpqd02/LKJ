package lkj.spring3.board.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lkj.spring3.model.Board;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private String ns="lkj.spring3.model.Board";
	
	@Override
	public List<Board> list() {
		
		return sqlSession.selectList(ns+".list");
	}
	@Override
	public void insert(Board board) {
		sqlSession.insert(ns+".insert", board);
	}
	@Override
	public Board content(long seq) {
		Board board =(Board)sqlSession.selectOne(ns+".content", seq);
		return board;
	}
	@Override
	public void delete(long seq) {
		sqlSession.delete(ns+".delete", seq);
	}
	@Override
	public void update(Board board) {
		sqlSession.update(ns+".update", board);
	}
}
