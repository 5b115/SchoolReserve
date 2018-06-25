Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'customer',
	appFolder : server_context + '/resources/js/customer/app',
	controllers : [ 'CustomerController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'customerGrid'
			} ]
		});
	}
});




