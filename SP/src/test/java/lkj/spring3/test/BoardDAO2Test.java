package lkj.spring3.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import lkj.spring3.board2.model.dao.BoardDAO2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
public class BoardDAO2Test {
	
	 @Inject
	 private BoardDAO2 dao;
	 
	 @Test
	 public void testList() {
		 try {
			 long count=dao.selectCount();
			 System.out.println("# count : "+count);
		 }catch(Exception se) {
			 System.out.println("# DataSourcetest se : "+se);
		 }
	 }
}
