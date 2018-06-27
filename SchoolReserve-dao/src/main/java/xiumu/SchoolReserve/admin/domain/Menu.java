package xiumu.SchoolReserve.admin.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import edu.zut.cs.javaee.dream.base.domain.BaseEntity;

@Table(name = "T_Menu")
@Entity
public class Menu extends BaseEntity{

	private static final long serialVersionUID = -4376674977047164142L;
	
	@Column(name = "MENUFOODNAME")
	String menufoodname;	//菜单菜名
	
	@Column(name = "MENUNUMBER")
	String menunumber;  //菜单编号
	
	@Column(name = "MENUPRICE")
	String menuprice;	//菜单价格
	
	public String getMenufoodname() {
		return menufoodname;
	}

	public void setmenufoodname(String menufoodname) {
		this.menufoodname = menufoodname;
	}

	public String getMenunumber() {
		return menunumber;
	}

	public void setMenunumber(String menunumber) {
		this.menunumber = menunumber;
	}
	
	public String getMenuprice() {
		return menuprice;
	}

	public void setMenuprice(String menuprice) {
		this.menuprice = menuprice;
	}
	
}