package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_INDENT")
@Entity
public class Indent extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "INDENDTOODNAME")
	String indentfoodname;	//订单菜品名
	
	@Column(name = "INDENTDATE")
	String indentdate;  //订单日期
	
	@Column(name = "INDENTPRICE")
	String indentprice;	//订单价格
	
	public String getIndentfoodname() {
		return indentfoodname;
	}

	public void setIndentfoodname(String indentfoodname) {
		this.indentfoodname = indentfoodname;
	}

	public String getIndentfoodnamedate() {
		return indentdate;
	}

	public void setIndentdate(String indentdate) {
		this.indentdate = indentdate;
	}
	
	public String getIndentprice() {
		return indentprice;
	}

	public void setIntendprice(String indentprice) {
		this.indentprice = indentprice;
	}
	
}
