Ext.define('indent.model.IndentModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.indentModel',
	fields : [ {
		name : 'indentfoodname',
		type : 'string',
		sortable : true
	}, {
		name : 'indentprice',
		type : 'string',
		sortable : true
	}, {
		name : 'indentdate',
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