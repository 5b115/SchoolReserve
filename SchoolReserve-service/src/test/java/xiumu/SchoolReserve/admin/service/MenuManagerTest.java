package xiumu.SchoolReserve.admin.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import xiumu.SchoolReserve.admin.domain.Menu;

public class MenuManagerTest extends GenericManagerTestCase<Long, Menu, MenuManager>{

	MenuManager menuManager;
	
	private static final Logger logger = LogManager.getLogger(MenuManagerTest.class.getName());
	
	
	public MenuManagerTest() {
		super(Menu.class);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setMenuManager(MenuManager menuManager) {
		this.menuManager = menuManager;
		this.manager = this.menuManager;
	}
	@Before
	public void setUp() throws Exception{
		for(int i=0;i<20;i++)
	  {
		Menu indent = new Menu();
		indent.setmenufoodname("地三鲜");
		indent.setMenunumber("001");
		indent.setMenuprice("10元");
		this.entity = this.manager.save(indent);
	  }
	}
	@Test@Rollback(false)
	public void testFindByMenufoodname() {
		List<Menu> result = this.menuManager.findbyMenufoodname("地三鲜");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("地三鲜", result.get(0).getMenufoodname());
	}
}