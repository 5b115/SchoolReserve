Ext.define('customer.model.CustomerModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.customerModel',
	fields : [ {
		name : 'CustomerSno',
		type : 'int',
		sortable : true
	}, {
		name : 'CustomerName',
		type : 'string',
		sortable : true
	}, {
		name : 'CustomerSex',
		type : 'string',
		sortable : true
	}, {
		name : 'RegistrationDate',
		type : 'string',
		sortable : true
	}]
});