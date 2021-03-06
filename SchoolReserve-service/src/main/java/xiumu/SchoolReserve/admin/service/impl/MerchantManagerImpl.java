package xiumu.SchoolReserve.admin.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import xiumu.SchoolReserve.admin.dao.MerchantDao;
import xiumu.SchoolReserve.admin.domain.Merchant;
import xiumu.SchoolReserve.admin.service.MerchantManager;

@Component
@Transactional
public class MerchantManagerImpl extends GenericManagerImpl<Merchant, Long> implements MerchantManager{

	MerchantDao merchantDao;
	
	@Override
	public List<Merchant> findbyMerchantname(String merchantname) {
		Merchant queryObject = new Merchant();
		queryObject.setMerchantname(merchantname);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("fullname", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Merchant> ex = Example.of(queryObject, matcher);
		List<Merchant> result = dao.findAll(ex);
		return result;
	}
	@Autowired
	public void setMerchantDao(MerchantDao merchantDao) {
		this.merchantDao = merchantDao;
		this.dao =  this.merchantDao;
	}
}
