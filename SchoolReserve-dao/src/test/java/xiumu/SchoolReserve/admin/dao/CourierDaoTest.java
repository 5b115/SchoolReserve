package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Courier;

public class CourierDaoTest extends GenericDaoTestCase<Long, Courier, CourierDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(CourierDaoTest.class.getName());
	
	@Autowired
	CourierDao courierDao;
	
	
	@Test
	public void testFindAll() {

		List<Courier> result = this.courierDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Courier> result={}", result); //$NON-NLS-1$
		}

	}
}
