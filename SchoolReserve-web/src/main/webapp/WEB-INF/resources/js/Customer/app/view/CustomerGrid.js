var pageSize = 20;

var areaStore = Ext.create('area.store.AreaStore');

Ext.define('area.view.AreaGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.areaGrid',
	title : '校园订餐顾客信息列表',
	store : areaStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "学号",
		width : 80,
		sortable : true,
		dataIndex : 'CustomerSno'
	}, {
		text : "姓名",
		width : 120,
		sortable : true,
		dataIndex : 'CustomerName'
	}, {
		text : "性别",
		width : 80,
		sortable : true,
		dataIndex : 'CustomerSex'
	}, {
		text : "注册时间",
		width : 150,
		dataIndex : 'RegistrationDate',
		renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : areaStore,
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
