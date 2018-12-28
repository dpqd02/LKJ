package lkj.spring3.board.model.dao;

import java.util.List;
import lkj.spring3.model.Board;

public interface BoardDAO {
	List<Board> list();
	void insert(Board board);
	Board content(long seq);
	void delete(long seq);
	void update(Board board);
}
