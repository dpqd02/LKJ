package lkj.spring3.slang.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lkj.spring3.model.Slang_Board;
import lkj.spring3.slang.model.dao.SlangDAO;

@Service
public class SlangServiceImpl implements SlangService{
	@Autowired
	private SlangDAO dao;

	@Override
	public List<Slang_Board> selectService() {
		return dao.select();
	}

	@Override
	public Slang_Board selectService(long seq) {
		return dao.select(seq);
	}
	
	
}
