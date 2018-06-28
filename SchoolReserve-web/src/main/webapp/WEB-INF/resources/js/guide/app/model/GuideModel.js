Ext.define('guide.model.GuideModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.guideModel',
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