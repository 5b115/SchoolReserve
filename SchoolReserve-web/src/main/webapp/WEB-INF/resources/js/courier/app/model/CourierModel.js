Ext.define('courier.model.CourierModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.courierModel',
	fields : [{
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'Caddress',
		type : 'string',
		sortable : true
	}, {
		name : 'Cname',
		type : 'string',
		sortable : true
	}, {
		name : 'Cphone',
		type : 'string',
		sortable : true
	},{
		name : 'sfwcdd',
		type : 'bool',
		sortable : true
	}]
});