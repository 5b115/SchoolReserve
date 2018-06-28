var pageSize = 20;

Ext.define('indent.store.IndentStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.indentStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'indent.model.IndentModel',
	proxy : {
		url : server_context + '/indent/.json',
		type : 'ajax',
		api : {
			read : server_context + '/indent/.json',
			update : server_context + '/indent/.json'
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