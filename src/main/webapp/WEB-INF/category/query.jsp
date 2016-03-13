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
		$('#dg').datagrid({
			url : 'datagrid_data.json',
			loadMsg : '请等待...',
			striped : true,
			nowrap : true,
			singleSelect : true,
			pagination : true,
			rownumbers:true,
			/* 	rowStyler : function(index, row) {
					if(index%2==0){
						return 'background-color:#6293bb;'
					}
				}, */

			frozenColumns : [ [ {
				field : 'a',
				checkbox : true
			}, {
				field : 'code',
				title : '编号',
				width : 50
			} ] ],
			columns : [ [ {
				field : 'name',
				title : '名称',
				width : 50
			}, {
				field : 'price',
				title : '价格',
				width : 100,
				align : 'right'
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
