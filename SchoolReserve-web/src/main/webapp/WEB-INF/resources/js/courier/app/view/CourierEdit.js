Ext.define('courier.view.CourierEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.courierEdit',
	title : '编辑快递人员信息',
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
				name : 'Cname',
				fieldLabel : '快递人员姓名'
			}, {
				xtype : 'textfield',
				name : 'Caddress',
				fieldLabel : '快递人员对应负责区域'
			}, {
				xtype : 'textfield',
				name : 'Cphone',
				fieldLabel : '快递人员手机号'
			}, {
				xtype : 'textfield',
				name : 'sfwcdd',
				fieldLabel : '当前订单完成状况'
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
