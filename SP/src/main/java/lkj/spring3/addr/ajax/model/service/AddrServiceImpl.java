package lkj.spring3.addr.ajax.model.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lkj.spring3.addr.ajax.model.dao.AddrDAO;
import lkj.spring3.model.Address;

@Service
public class AddrServiceImpl implements AddrService{
	
	@Autowired
	private AddrDAO dao;
	
	@Override
	public List<Address> listService() {
		//업무로직 추가
		return dao.list();
	}
	
	@Override
	public void insertService(Address address) {
		dao.insert(address);
		System.out.println("# insert Address Complete");
	}
	@Override
	public void deleteService(long seq) {
		dao.delete(seq);
		System.out.println("# delete Address Complete");
	}
	
	//for Ajax start
	@Override
	public Address selectService(long seq) {
		return dao.select(seq);
	}

	@Override
	public List<Address> selectService(String name) {
		return dao.select(name);
	}
	//for Ajax start
}
