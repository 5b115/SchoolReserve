Ext.define('merchant.view.MerchantEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.merchantEdit',
	title : '编辑商户信息',
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
				name : 'merchantname',
				fieldLabel : '商户名'
			}, {
				xtype : 'textfield',
				name : 'merchantaddress',
				fieldLabel : '商户地址'
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
