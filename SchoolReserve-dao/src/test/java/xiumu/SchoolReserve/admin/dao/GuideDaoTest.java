package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Guide;

public class GuideDaoTest extends GenericDaoTestCase<Long, Guide, GuideDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(GuideDaoTest.class.getName());
	
	@Autowired
	GuideDao GuideDao;
	
	@Test
	public void testFindAll() {

		List<Guide> result = this.GuideDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Guide> result={}", result); //$NON-NLS-1$
		}

	}
}

