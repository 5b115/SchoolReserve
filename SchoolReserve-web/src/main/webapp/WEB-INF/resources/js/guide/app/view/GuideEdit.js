Ext.define('guide.view.GuideEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.guideEdit',
	title : '编辑导航信息',
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
				name : 'cmaddress',
				fieldLabel : '商家地址'
			}, {
				xtype : 'textfield',
				name : 'ccaddress',
				fieldLabel : '顾客地址'
			}, {
				xtype : 'textfield',
				name : 'cdistance',
				fieldLabel : '相据距离'
			}, {
				xtype : 'textfield',
				name : 'ctime',
				fieldLabel : '预计到达时间'
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
