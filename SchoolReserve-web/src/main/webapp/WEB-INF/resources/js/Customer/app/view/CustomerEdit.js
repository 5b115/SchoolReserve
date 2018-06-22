Ext.define('customer.view.AreaEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.customerEdit',
	title : '编辑顾客信息',
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
				name : 'CustomerSno',
				fieldLabel : '顾客学号'
			}, {
				xtype : 'textfield',
				name : 'CustomerName',
				fieldLabel : '顾客姓名'
			}, {
				xtype : 'textfield',
				name : 'CustomerSex',
				fieldLabel : '顾客性别'
			} {
				xtype : 'textfield',
				name : 'RegistrationDate',
				fieldLabel : '注册日期'
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
