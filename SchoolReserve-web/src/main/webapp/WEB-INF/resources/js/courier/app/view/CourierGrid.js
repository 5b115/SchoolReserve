var pageSize = 20;

var courierStore = Ext.create('courier.store.CourierStore');

Ext.define('courier.view.CourierGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.courierGrid',
	title : '快递人员信息列表',
	store : courierStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	},{
		text : '姓名',
		width : 120,
		sortable : true,
		dataIndex : 'cname'
	},{
		text : "负责区域",
		width : 120,
		sortable : true,
		dataIndex : 'caddress'
	}, {
		text : "手机号",
		width : 150,
		sortable : true,
		dataIndex : 'cphone'
	}, {
		text : "订单完成情况",
		width : 200,
		width : 200,
		sortable : true,
		dataIndex : 'sfwcdd'
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : courierStore,
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
