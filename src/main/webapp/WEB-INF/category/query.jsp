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
			columns : [ [ {
				field : 'code',
				title : '编号',
				width : 50
			}, {
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
