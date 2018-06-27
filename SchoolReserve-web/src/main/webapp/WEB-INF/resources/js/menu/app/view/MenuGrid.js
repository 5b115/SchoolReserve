var pageSize = 20;

var menuStore = Ext.create('menu.store.MenuStore');

Ext.define('menu.view.MenuGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.menuGrid',
	title : '菜单信息表',
	store : menuStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "菜品名称",
		width : 120,
		sortable : true,
		dataIndex : 'menuname'
	}, {
		text : "菜品编号",
		width : 80,
		sortable : true,
		dataIndex : 'menunumber'
	}, {
		text : "菜品价格",
		width : 150,
		dataIndex : 'menuprice'
		sortable : true
	}],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : menuStore,
		displayInfo : true,
		firstTest : '首页',
		lastText : '尾页',
		nextText : '下页',
		prevText : '前页',
		beforePageText : '第',
		afterPageText : '页，共{0}页',
		displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
		emptyMsg : "没有记录"
	})
});

