Ext.define('customer.view.CustomerEdit', {
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
				name : 'customerSno',
				fieldLabel : '顾客学号'
			}, {
				xtype : 'textfield',
				name : 'customerName',
				fieldLabel : '顾客姓名'
			}, {
				xtype : 'textfield',
				name : 'customerSex',
				fieldLabel : '顾客性别'
			}, {
				xtype : 'textfield',
				name : 'registrationDate',
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
