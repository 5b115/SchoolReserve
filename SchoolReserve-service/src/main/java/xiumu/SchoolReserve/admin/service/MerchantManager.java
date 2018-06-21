package xiumu.SchoolReserve.admin.service;


import java.util.List;

import edu.zut.cs.javaee.dream.base.service.GenericManager;
import xiumu.SchoolReserve.admin.domain.Merchant;

public interface MerchantManager extends GenericManager<Merchant, Long> {

	
	List<Merchant> findAll();
	
	List<Merchant> findbyMerchantname(String merchantname);
}
