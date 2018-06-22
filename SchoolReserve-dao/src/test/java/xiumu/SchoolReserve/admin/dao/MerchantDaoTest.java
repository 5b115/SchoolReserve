package xiumu.SchoolReserve.admin.dao;
 
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import xiumu.SchoolReserve.admin.domain.Merchant;

public class MerchantDaoTest extends GenericGenerator{

	@Autowired
	MerchantDao merchantDao;
	
	
	@Test
	public void testAdd() {

		Merchant merchant = new Merchant();
		merchant.setMerchantname("黄焖鸡");
		merchant.setMerchantaddress("北苑餐厅");
		this.merchantDao.save(merchant);
	}
}
