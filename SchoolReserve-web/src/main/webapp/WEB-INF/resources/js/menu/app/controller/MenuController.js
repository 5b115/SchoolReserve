Ext.define('menu.controller.MenuController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.menuController',
	stores : [ 'MenuStore' ],
	models : [ 'MenuModel' ],
	views : [ 'MenuGrid', 'MenuEdit' ],
	init : function() {
		this.control({
			'menuGrid' : {
				itemdblclick : this.editmenu
			},
			'menuEdit button[action=save]' : {
				click : this.updatemenu
			}
		});
	},
	editmenu : function(grid, record) {
		var view = Ext.widget('menuEdit');
		view.down('form').loadRecord(record);
	},
	updatemenu : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
