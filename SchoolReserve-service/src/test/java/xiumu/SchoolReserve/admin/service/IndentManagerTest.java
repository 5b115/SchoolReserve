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

import edu.zut.cs.javaee.dream.base.service.GenericManagerTestCase;
import xiumu.SchoolReserve.admin.domain.Indent;

public class IndentManagerTest extends GenericManagerTestCase<Long, Indent, IndentManager>{

	IndentManager indentManager;
	
	private static final Logger logger = LogManager.getLogger(IndentManagerTest.class.getName());
	
	
	public IndentManagerTest() {
		super(Indent.class);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setIndentManager(IndentManager indentManager) {
		this.indentManager = indentManager;
		this.manager = this.indentManager;
	}
	@Before
	public void setUp() {
		Indent indent = new Indent();
		indent.setIndentfoodname("地三鲜");
		indent.setIndentdate("2018年6月1日");
		indent.setIntendprice("10元");
		this.entity = this.manager.save(indent);
	}
	@Test
	public void testFindByIndentfoodname() {
		List<Indent> result = this.indentManager.findbyIndentfoodname("地三鲜");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("地三鲜", result.get(0).getIndentfoodname());
	}
}
