Ext.define('merchant.model.MerchantModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.merchantModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'merchantname',
		type : 'string',
		sortable : true
	}, {
		name : 'merchantaddress',
		type : 'string',
		sortable : true
	}, {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});