Ext.define('courier.controller.CourierController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.courierController',
	stores : [ 'CourierStore' ],
	models : [ 'CourierModel' ],
	views : [ 'CourierGrid', 'CourierEdit' ],
	init : function() {
		this.control({
			'courierGrid' : {
				itemdblclick : this.editCourier
			},
			'courierEdit button[action=save]' : {
				click : this.updateCourier
			}
		});
	},
	editCourier : function(grid, record) {
		var view = Ext.widget('courierEdit');
		view.down('form').loadRecord(record);
	},
	updateCourier : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
