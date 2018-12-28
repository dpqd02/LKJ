package lkj.spring3.board.service;

import java.util.List;
import lkj.spring3.model.Board;

public interface BoardService {
	List<Board> listService();
	void insertService(Board board);
	Board contentService(long seq);
	void deleteService(long seq);
	void updateService(Board board);
}
