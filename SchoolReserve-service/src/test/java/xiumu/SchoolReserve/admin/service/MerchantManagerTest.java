package xiumu.SchoolReserve.admin.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.dream.base.service.GenericGenerator;
import xiumu.SchoolReserve.admin.domain.Merchant;

public class MerchantManagerTest extends GenericGenerator{

	@Autowired
	MerchantManager merchantManager;
	
	
	@Test
	public void testAdd() {
		Merchant merchant = new Merchant();
		merchant.setMerchantname("黄焖鸡");
		merchant.setMerchantaddress("北苑三楼");
		this.merchantManager.save(merchant);
	}
}
