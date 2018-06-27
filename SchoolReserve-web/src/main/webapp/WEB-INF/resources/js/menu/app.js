Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'menu',
	appFolder : server_context + '/resources/js/menu/app',
	controllers : [ 'MenuController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'menuGrid'
			} ]
		});
	}
});
