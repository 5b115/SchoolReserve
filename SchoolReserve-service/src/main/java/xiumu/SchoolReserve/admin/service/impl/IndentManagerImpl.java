package xiumu.SchoolReserve.admin.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers;
import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.dream.base.service.impl.GenericManagerImpl;
import xiumu.SchoolReserve.admin.dao.IndentDao;
import xiumu.SchoolReserve.admin.domain.Indent;
import xiumu.SchoolReserve.admin.service.IndentManager;

@Component
@Transactional
public class IndentManagerImpl extends GenericManagerImpl<Indent, Long> implements IndentManager{

	IndentDao indentDao;
	
	@Override
	public List<Indent> findbyIndentfoodname(String indentfoodname) {
		Indent queryObject = new Indent();
		queryObject.setIndentfoodname(indentfoodname);
		// 创建匹配器，即如何使用查询条件
		ExampleMatcher matcher = ExampleMatcher.matching() // 构建对象
				.withMatcher("fullname", GenericPropertyMatchers.startsWith()) // 姓名采用“开始匹配”的方式查询
				.withIgnorePaths("dateCreated", "dateModified"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
		// 创建实例并查询
		Example<Indent> ex = Example.of(queryObject, matcher);
		List<Indent> result = dao.findAll(ex);
		return result;
	}
	@Autowired
	public void setIndentDao(IndentDao indentDao) {
		this.indentDao = indentDao;
		this.dao =  this.indentDao;
	}
}
