var pageSize = 20;

Ext.define('courier.store.CourierStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.courierStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'courier.model.CourierModel',
	proxy : {
		url : server_context + '/courier/.json',
		type : 'ajax',
		api : {
			read : server_context + '/courier/.json',
			update : server_context + '/courier/.json'
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