Ext.define('indent.view.iIdentEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.indentEdit',
	title : '编辑订单信息',
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
				name : 'indentfoodname',
				fieldLabel : '订单菜品名'
			}, {
				xtype : 'textfield',
				name : 'indentprice',
				fieldLabel : '订单价格'
			}, {
				xtype : 'textfield',
				name : 'indentdate',
				fieldLabel : '订单日期'
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
