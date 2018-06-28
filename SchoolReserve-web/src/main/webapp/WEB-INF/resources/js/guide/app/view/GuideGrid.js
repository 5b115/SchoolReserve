var pageSize = 20;

var guideStore = Ext.create('guide.store.GuideStore');

Ext.define('guide.view.GuideGrid', {
	extend : 'Ext.grid.GridPanel',
	alias : 'widget.guideGrid',
	title : '导航信息表',
	store : guideStore,
	columns : [ {
		text : 'ID',
		width : 50,
		sortable : true,
		dataIndex : 'id'
	}, {
		text : "商家地址",
		width : 120,
		sortable : true,
		dataIndex : 'cmaddress'
	}, {
		text : "顾客地址",
		width : 120,
		sortable : true,
		dataIndex : 'ccaddress'
	}, {
		text : "相据距离",
		width : 80,
		sortable : true,
		dataIndex : 'cdistance'
	}, {
		text : "预计到达时间",
		width : 50,
		dataIndex : 'ctime',
		sortable : true
	} ],
	viewConfig : {
		columnsText : '列',
		sortAscText : '升序',
		sortDescText : '降序'
	},

	bbar : new Ext.PagingToolbar({
		pageSize : pageSize,// 每页显示的记录值
		store : guideStore,
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
