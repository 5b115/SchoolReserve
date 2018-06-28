Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'guide',
	appFolder : server_context + '/resources/js/guide/app',
	controllers : [ 'GuideController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'guideGrid'
			} ]
		});
	}
});




