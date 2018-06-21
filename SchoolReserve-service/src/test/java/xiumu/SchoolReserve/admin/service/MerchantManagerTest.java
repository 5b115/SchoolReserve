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
import xiumu.SchoolReserve.admin.domain.Merchant;

public class MerchantManagerTest extends GenericManagerTestCase<Long, Merchant, MerchantManager>{

	MerchantManager merchantManager;
	
	private static final Logger logger = LogManager.getLogger(MerchantManagerTest.class.getName());
	
	
	public MerchantManagerTest() {
		super(Merchant.class);
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public void setMerchantManager(MerchantManager merchantManager) {
		this.merchantManager = merchantManager;
		this.manager = this.merchantManager;
	}
	@Test
	public void TestInsert() throws Exception {
		Merchant merchant = new Merchant();
		merchant.setMerchantname("张三");
		merchant.setMerchantaddress("河南省郑州市");
		this.manager.save(merchant);
	}
	@Test
	public void testFindByMerchantname() {
		List<Merchant> result = this.merchantManager.findbyMerchantname("张");
		assertNotNull(result);
		assertEquals(1, result.size());
		assertEquals("张三", result.get(0).getMerchantname());
	}
}
