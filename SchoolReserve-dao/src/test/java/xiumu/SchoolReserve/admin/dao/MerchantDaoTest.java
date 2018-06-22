package xiumu.SchoolReserve.admin.dao;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.dao.GenericDaoTestCase;
import xiumu.SchoolReserve.admin.domain.Merchant;

public class MerchantDaoTest extends GenericDaoTestCase<Long, Merchant, MerchantDao>{

	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(MerchantDaoTest.class.getName());
	
	@Autowired
	MerchantDao merchantDao;
	
	
	@Test
	public void testInsert() {

		Merchant merchant = new Merchant();
		merchant.setMerchantaddress("北苑餐厅");
		
	}
}
