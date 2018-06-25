Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'merchant',
	appFolder : server_context + '/resources/js/merchant/app',
	controllers : [ 'MerchantController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'merchantGrid'
			} ]
		});
	}
});
