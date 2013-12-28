<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success</title>
    <link href="../css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<br><br>
<div class="alert alert-success" style="width:250px;">
   Tutorial Name is &nbsp;<b><s:property value="tutorial" /></b>
</div>
<a href="../Search.jsp" >Check Again</a>
</body>
</html>