package lkj.spring3.board2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lkj.spring3.board2.model.dao.BoardDAO2;
import lkj.spring3.board2.vo.ListResult;
import lkj.spring3.model.Board2;

@Service
public class BoardService2Impl implements BoardService2 {
	@Autowired
	private BoardDAO2 dao;
	
	@Override
	public ListResult getListResult(int page, int pageSize) {
		long totalCount=dao.selectCount();
		List<Board2> list=dao.select(page, pageSize);
		return new ListResult(page,totalCount,pageSize,list);
	}

	@Override
	public Board2 getBoard(long seq) {
		return dao.select(seq);
	}

	@Override
	public void write(Board2 board) {
		dao.insert(board);
	}

	@Override
	public void edit(Board2 board) {
		dao.update(board);
	}

	@Override
	public void remove(long seq) {
		dao.delete(seq);
	}

}
