package lkj.spring3.addr.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lkj.spring3.addr.model.dao.AddrDAO;
import lkj.spring3.model.Address;

@Service("addrService")
public class AddrServiceImpl implements AddrService{
	
	@Resource(name="addrDAO")
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

}
