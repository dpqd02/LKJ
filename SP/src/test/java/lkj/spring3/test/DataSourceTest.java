package lkj.spring3.test;

import javax.inject.Inject;
import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class DataSourceTest {

  @Inject
  private DataSource ds;

  @Test
  public void testConnection() throws Exception {
	  try {
		  System.out.println("# DataSourcetest ds: " + ds);
		  System.out.println("# DataSourcetest con: " + ds.getConnection());
	  }catch(Exception se) {
		  System.out.println("# DataSourcetest se : "+se);
	  }
  }
  
}