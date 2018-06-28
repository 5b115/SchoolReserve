Ext.define('indent.controller.IndentController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.indentController',
	stores : [ 'IndentStore' ],
	models : [ 'IndentModel' ],
	views : [ 'IndentGrid', 'IndentEdit' ],
	init : function() {
		this.control({
			'indentGrid' : {
				itemdblclick : this.editIndent
			},
			'indentEdit button[action=save]' : {
				click : this.updateIndent
			}
		});
	},
	editIndent : function(grid, record) {
		var view = Ext.widget('indentEdit');
		view.down('form').loadRecord(record);
	},
	updateIndent : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
