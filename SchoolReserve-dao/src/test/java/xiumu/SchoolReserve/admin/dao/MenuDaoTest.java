package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Menu;

public class MenuDaoTest extends GenericDaoTestCase<Long, Menu, MenuDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(MenuDaoTest.class.getName());
	
	@Autowired
	MenuDao menuDao;
	
	
	@Test
	public void testFindAll() {

		List<Menu> result = this.menuDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Menu> result={}", result); //$NON-NLS-1$
		}

	}
}