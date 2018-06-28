package xiumu.SchoolReserve.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import xiumu.SchoolReserve.admin.domain.Indent;

public class IndentManagerTest extends GenericGenerator{

	@Autowired
	IndentManager indentManager;
	
	
	@Test
	public void testAdd() {
		for(int i=0;i<20;i++) {
			Indent indent = new Indent();
			indent.setindentfoodname("黄焖鸡");
			indent.setindentprice("11元");
			indent.setindentdate("18年6月10日");
			this.indentManager.save(indent);
		}
			
		
		
	}
}
