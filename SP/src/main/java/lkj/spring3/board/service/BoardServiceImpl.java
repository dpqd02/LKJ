package lkj.spring3.board.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lkj.spring3.board.model.dao.BoardDAO;
import lkj.spring3.model.Board;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	private BoardDAO dao;
	@Override
	public List<Board> listService() {
		return dao.list();
	}
	@Override
	public void insertService(Board board) {
		dao.insert(board);
	}
	@Override
	public Board contentService(long seq) {
		return dao.content(seq);
	}
	@Override
	public void deleteService(long seq) {
		dao.delete(seq);
	}
	@Override
	public void updateService(Board board) {
		dao.update(board);
	}
}
