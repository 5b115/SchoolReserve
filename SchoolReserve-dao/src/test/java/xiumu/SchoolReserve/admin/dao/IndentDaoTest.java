package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Indent;

public class IndentDaoTest extends GenericDaoTestCase<Long, Indent, IndentDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(IndentDaoTest.class.getName());
	
	@Autowired
	IndentDao indentDao;
	
	
	@Test
	public void testFindAll() {

		List<Indent> result = this.indentDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Indent> result={}", result); //$NON-NLS-1$
		}

	}
}
