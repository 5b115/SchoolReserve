Ext.define('merchant.model.MerchantModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.merchantModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'code',
		type : 'string',
		sortable : true
	}, {
		name : 'fullName',
		type : 'string',
		sortable : true
	}, {
		name : 'gender',
		type : 'string',
		sortable : true
	}, {
		name : 'major',
		type : 'string',
		sortable : true
	}, {
		name : 'grade',
		type : 'string',
		sortable : true
	}, {
		name : 'clazz',
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