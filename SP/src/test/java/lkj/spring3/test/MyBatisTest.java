package lkj.spring3.test;

import javax.inject.Inject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class MyBatisTest {

  @Inject
  private SqlSessionFactory sqlSessionFactory;

  @Test
  public void testFactory() throws Exception {
	  System.out.println("# MyBatisTest sqlSessionFactory: " + sqlSessionFactory);
  }
  @Test
  public void testSession() throws Exception {
      SqlSession sqlSession = sqlSessionFactory.openSession();
	  System.out.println("# MyBatisTest sqlSession: " + sqlSession);
  }
}