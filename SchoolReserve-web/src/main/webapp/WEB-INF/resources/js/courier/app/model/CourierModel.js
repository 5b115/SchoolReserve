Ext.define('courier.model.CourierModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.courierModel',
	fields : [{
		name : 'id',
		type : 'int',
		sortable : true
	},  {
		name : 'cname',
		type : 'string',
		sortable : true
	}, 
	{
		name : 'caddress',
		type : 'string',
		sortable : true
	},{
		name : 'cphone',
		type : 'string',
		sortable : true
	},{
		name : 'sfwcdd',
		type : 'bool',
		sortable : true
	}]
});