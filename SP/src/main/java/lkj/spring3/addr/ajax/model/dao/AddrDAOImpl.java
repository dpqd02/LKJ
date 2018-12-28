package lkj.spring3.addr.ajax.model.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import lkj.spring3.model.Address;

//dao정의
@Repository
public class AddrDAOImpl implements AddrDAO {
	
	@Autowired
	private SqlSession sqlSession; //root에있는 객체 연결 autowired
	private String ns="lkj.spring3.ajax.model.Address";
	
	@Override
	public List<Address> list() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+".list");
	}
	@Override
	public void insert(Address address) {
		sqlSession.insert(ns+".insert", address);
	}
	@Override
	public void delete(long seq) {
		sqlSession.delete(ns+".delete", seq);
	}
	
	//for Ajax start
	@Override
	public Address select(long seq) {
		return sqlSession.selectOne(ns+".selectBySeq", seq);
	}
	@Override
	public List<Address> select(String name) {
		return sqlSession.selectList(ns+".selectByName", name);
	}
	//for Ajax start
}
