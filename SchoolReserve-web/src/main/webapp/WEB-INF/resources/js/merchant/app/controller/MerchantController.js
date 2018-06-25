Ext.define('merchant.controller.MerchantController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.merchantController',
	stores : [ 'MerchantStore' ],
	models : [ 'MerchantModel' ],
	views : [ 'MerchantGrid', 'MerchantEdit' ],
	init : function() {
		this.control({
			'merchantGrid' : {
				itemdblclick : this.editMerchant
			},
			'merchantEdit button[action=save]' : {
				click : this.updateMerchant
			}
		});
	},
	editMerchant : function(grid, record) {
		var view = Ext.widget('merchantEdit');
		view.down('form').loadRecord(record);
	},
	updateMerchant : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
