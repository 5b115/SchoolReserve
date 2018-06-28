var pageSize = 20;

Ext.define('guide.store.GuideStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.guideStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'guide.model.GuideModel',
	proxy : {
		url : server_context + '/guide/.json',
		type : 'ajax',
		api : {
			read : server_context + '/guide/.json',
			update : server_context + '/guide/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});