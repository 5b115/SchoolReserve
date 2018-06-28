Ext.define('customer.model.CustomerModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.customerModel',
	fields : [ {
		name : 'cmaddress',
		type : 'string',
		sortable : true
	}, {
		name : 'ccaddress',
		type : 'string',
		sortable : true
	}, {
		name : 'cdistance',
		type : 'string',
		sortable : true
	}, {
		name : 'ctime',
		type : 'string',
		sortable : true
	}]
});