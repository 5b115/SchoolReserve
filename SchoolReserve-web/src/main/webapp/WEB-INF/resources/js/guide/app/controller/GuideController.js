Ext.define('guide.controller.GuideController', {
	extend : 'Ext.app.Controller',
	alias : 'widget.customerController',
	stores : [ 'GuideStore' ],
	models : [ 'GuideModel' ],
	views : [ 'GuideGrid', 'GuideEdit' ],
	init : function() {
		this.control({
			'guideGrid' : {
				itemdblclick : this.editGuide
			},
			'guideEdit button[action=save]' : {
				click : this.updateGuide
			}
		});
	},
	editGuide : function(grid, record) {
		var view = Ext.widget('guideEdit');
		view.down('form').loadRecord(record);
	},
	updateGuide : function(button) {
		var win = button.up('window');
		form = win.down('form');
		record = form.getRecord();
		values = form.getValues();
		record.set(values);
		win.close();
	}
});
