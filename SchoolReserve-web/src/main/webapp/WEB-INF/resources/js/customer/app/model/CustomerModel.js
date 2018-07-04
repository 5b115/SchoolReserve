Ext.define('customer.model.CustomerModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.customerModel',
	fields : [ {
		name : 'customerSno',
		type : 'int',
		sortable : true
	}, {
		name : 'customerName',
		type : 'string',
		sortable : true
	}, {
		name : 'customerSex',
		type : 'string',
		sortable : true
	}, {
		name : 'registrationDate',
		type : 'string',
		sortable : true
	}, {
		name : 'customerIntro',
		type : 'string',
		sortable : true
	}]
});