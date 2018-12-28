package lkj.spring3.test;

import java.util.List;
import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lkj.spring3.model.Address;
import lkj.spring3.addr.model.dao.AddrDAO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class AddrDAOTest {

  @Inject
  private AddrDAO dao;

  @Test
  public void testList(){
	  try {
		  List<Address> list=dao.list();
		  System.out.println("# list.size : "+list.size());
		  for(Address addr : list) {
			  String name=addr.getName();
			  System.out.println("# name : "+ name);
		  }
	  }catch(Exception se) {
		  System.out.println("# DataSourcetest se : "+se);
	  }
  }
  
}