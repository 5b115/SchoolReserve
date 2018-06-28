Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'indent',
	appFolder : server_context + '/resources/js/indent/app',
	controllers : [ 'IndentController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'indentGrid'
			} ]
		});
	}
});
