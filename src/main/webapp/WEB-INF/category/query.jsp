<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="/public/head.jspf"%>
<style type="text/css">
body {
	margin: 5px;
}
</style>
<script type="text/javascript">
	$(function() {
		$('#dg')
				.datagrid(
						{
							url : 'category_queryJoninAccount.action',
							loadMsg : '请等待...',
							striped : true,
							nowrap : true,
							singleSelect : true,
							pagination : true,
							rownumbers : true,
							queryParams : {
								type : ''
							},
							/* 	rowStyler : function(index, row) {
									if(index%2==0){
										return 'background-color:#6293bb;'
									}
								}, */

							frozenColumns : [ [ {
								field : 'x',
								checkbox : true
							}, {
								field : 'id',
								title : '编号',
								width : 50
							} ] ],
							columns : [ [
									{
										field : 'type',
										title : '类别',
										width : 50
									},
									{
										field : 'hot',
										title : '热点',
										width : 100,
										align : 'right',
										formatter : function(value, row, index) {
											if (value) {
												return '<input type="checkbox" checked="checked" disable="true"/>';
											} else {
												return '<input type="checkbox"  disable="true"/>';

											}
										}
									},
									{
										field : 'account',
										title : '所属管理员',
										width : 100,
										align : 'right',
										formatter : function(value, row, index) {
											if (row.account != null
													&& row.account.login != null) {
												return row.account.login
											}
										}
									} ] ]
						});

	})
</script>

</head>

<body>
	<table id="dg">
	</table>

</body>
</html>
