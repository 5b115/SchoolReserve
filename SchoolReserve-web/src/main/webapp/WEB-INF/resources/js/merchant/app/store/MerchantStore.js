var pageSize = 20;

Ext.define('merchant.store.MerchantStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.merchantStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'merchant.model.MerchantModel',
	proxy : {
		url : server_context + '/merchant/.json',
		type : 'ajax',
		api : {
			read : server_context + '/merchant/.json',
			update : server_context + '/merchant/.json'
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