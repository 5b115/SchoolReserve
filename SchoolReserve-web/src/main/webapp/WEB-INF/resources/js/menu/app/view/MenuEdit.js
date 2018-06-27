Ext.define('menu.view.MenuEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.menuEdit',
	title : '编辑菜单信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [ {
				xtype : 'textfield',
				name : 'menuname',
				fieldLabel : '菜品名'
			}, {
				xtype : 'textfield',
				name : 'menunumber',
				fieldLabel : '菜品编号'
			}]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
