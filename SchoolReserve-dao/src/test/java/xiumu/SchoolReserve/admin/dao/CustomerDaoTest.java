package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Customer;

public class CustomerDaoTest extends GenericDaoTestCase<Long, Customer, CustomerDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(CustomerDaoTest.class.getName());
	
	@Autowired
	CustomerDao CustomerDao;
	
	@Test
	public void testFindAll() {

		List<Customer> result = this.CustomerDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<Customer> result={}", result); //$NON-NLS-1$
		}

	}
}
