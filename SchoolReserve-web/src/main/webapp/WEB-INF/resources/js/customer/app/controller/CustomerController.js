Ext.define('customer.controller.CustomerController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.customerController',
	stores : [ 'CustomerStore' ],
	models : [ 'CustomerModel' ],
	views : [ 'CustomerGrid', 'CustomerEdit' ],
	init : function() {
		this.control({
			'customerGrid' : {
				itemdblclick : this.editCustomer
			},
			'customerEdit button[action=save]' : {
				click : this.updateCustomer
			}
		});
	},
	editCustomer : function(grid, record) {
		var view = Ext.widget('customerEdit');
		view.down('form').loadRecord(record);
	},
	updateCustomer : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
