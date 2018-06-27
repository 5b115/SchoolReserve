Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'courier',
	appFolder : server_context + '/resources/js/courier/app',
	controllers : [ 'CourierController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'courierGrid'
			} ]
		});
	}
});




