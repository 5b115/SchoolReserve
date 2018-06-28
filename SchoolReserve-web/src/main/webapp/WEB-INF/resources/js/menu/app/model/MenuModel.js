Ext.define('menu.model.MenuModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.menuModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'menufoodname',
		type : 'string',
		sortable : true
	}, {
		name : 'menunumber',
		type : 'string',
		sortable : true
	}, {
		name : 'menuprice',
		type : 'string',
		sortable : true
	} ]
});