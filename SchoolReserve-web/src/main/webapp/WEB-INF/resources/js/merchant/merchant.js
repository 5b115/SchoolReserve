Ext.require(['Ext.data.*', 'Ext.grid.*']);

Ext.define('merchant.MerchantModel', {
			extend : 'Ext.data.Model',
			fields : [{
						name : 'id',
						type : 'int',
						sortable : true
					}, {
						name : 'merchantname',
						type : 'string',
						sortable : true
					}, {
						name : 'merchantaddress',
						type : 'string',
						sortable : true
					}, {
						name : 'dateCreated',
						type : 'date',
						dateFormat : 'time',
						sortable : true
					}, {
						name : 'dateModified',
						type : 'date',
						dateFormat : 'time',
						sortable : true
					}]
		});

var pageSize = 20;

var store = new Ext.data.Store({
			autoLoad : true,
			autoSync : true,// 需要同步
			model : 'merchant.MerchantModel',
			proxy : {
				type : 'rest',
				url : './.json',
				reader : {
					type : 'json',
					root : 'content',
					totalProperty : 'totalElements'
				},
				writer : {
					type : 'json'
				}
			},
			listeners : {
				write : function(store, operation) {
					var record = operation.getRecords()[0], name = Ext.String
							.capitalize(operation.action), verb;
					if (name == 'Destroy') {
						record = operation.records[0];
						verb = 'Destroyed';
					} else {
						verb = name + 'd';
					}
					Ext.example.msg(name, Ext.String.format("{0} user: {1}",
									verb, record.getId()));
				}
			},
			// 每页显示的记录行数
			pageSize : pageSize
		});

var textFieldEditor = {
	xtype : 'textfield',
	allowBlank : false,
	blankText : '该字段不能为空！',
	minLength : 4,
	minText : '至少需要输入{0}个字符！',
	maxLength : 20,
	maxText : '最多输入{0}个字符！'
}

var genderFieldEditor = {
	xtype : 'combo',
	triggerAction : 'all',
	forceSelection : true,
	displayField : 'label',
	valueField : 'id',
	mode : 'local',
	store : {
		xtype : 'jsonstore',
		fields : ['id', 'label'],
		data : [{
					id : '男',
					label : '男'
				}, {
					id : '女',
					label : '女'
				}]
	}
}
var rowEditing = Ext.create('Ext.grid.plugin.RowEditing', {
			listeners : {
				cancelEdit : function(rowEditing, context) {
					// Canceling editing of a locally added, unsaved record:
					// remove it
					if (context.record.phantom) {
						store.remove(context.record);
					}
				}
			}
		});

var merchantGrid = new Ext.grid.GridPanel({
			id : 'merchantGrid',
			plugins : [rowEditing],
			store : store,
			region : 'center',
			columnLines : true,
			loadMask : true,
			stripeRows : true,
			width : 600,
			title : '商户基本信息列表',
			columns : [{
						text : 'ID',
						width : 50,
						sortable : true,
						dataIndex : 'id'
					}, {
						text : "商户名",
						width : 120,
						sortable : true,
						dataIndex : 'merchantname',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					}, {
						text : "商户地址",
						width : 80,
						sortable : true,
						dataIndex : 'merchantaddress',
						editor : textFieldEditor,
						field : {
							xtype : 'textfield'
						}
					},  {
						text : "添加时间",
						width : 150,
						dataIndex : 'dateCreated',
						renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
						sortable : true
					}, {
						text : "修改时间",
						width : 150,
						dataIndex : 'dateModified',
						renderer : Ext.util.Format.dateRenderer('Y/m/d H:i:s'),
						sortable : true
					}],
			viewConfig : {
				columnsText : '列',
				sortAscText : '升序',
				sortDescText : '降序'
			},
			tbar : {
				xtype : 'toolbar',
				frame : true,
				border : false,
				padding : 2,
				bbar : new Ext.PagingToolbar({
							pageSize : pageSize,// 每页显示的记录值
							store : store,
							displayInfo : true,
							firstTest : '首页',
							lastText : '尾页',
							nextText : '下页',
							prevText : '前页',
							beforePageText : '第',
							afterPageText : '页，共{0}页',
							displayMsg : '记录数：第{0}条 - 第{1}条，共 {2}条',
							emptyMsg : "没有记录"
						})
			}
		});

merchantGrid.getSelectionModel().on('selectionchange',
		function(selModel, selections) {
			studentGrid.down('#delete').setDisabled(selections.length === 0);
		});

new Ext.form.NumberField({
	fieldLabel : '整数',
	allowDecimals : false, // 不允许输入小数
	nanText : '请输入有效整数', // 无效数字提示
	allowNegative : false
		// 不允许输入负数
	});

var clearForm = function() {
	Ext.Msg.alert('重置', '重置查询表单！');
	merchantForm.getForm().reset();
}

var queryForm = function() {
	Ext.Msg.alert('查询', '将开始执行查询！');
}
var merchantForm = new Ext.form.FormPanel({
			title : '信息查询',
			width : 200,
			height : 200,
			frame : true,
			region : 'north',
			defaultType : 'textfiled',
			labelWidth : 30,
			items : [{
						fieldLabel : "商户名",
						xtype : 'textfield',
						name : 'merchantname'
					}, {
						fieldLabel : "商户地址",
						xtype : 'textfield',
						name : 'merchantaddress'
					}],
			buttons : [{
						xtype : 'button',
						text : '查询',
						handler : queryForm,
						scope : this
					}, {
						xtype : 'button',
						text : '重置',
						handler : clearForm,
						scope : this
					}]
		})

Ext.application({
			name : '商户信息',
			launch : function() {
				Ext.create('Ext.container.Viewport', {
							layout : 'border',
							items : [merchantForm, merchantGrid]
						});
			}
		});
