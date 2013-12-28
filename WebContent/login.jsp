<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" />
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="js/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<br>
<div class="container">
<div class="row">
 <div class="span4">
  <div class="well">
  <fieldset>
       <legend>Login</legend>
  <s:form action="login" method="post">
  <s:textfield name="username" cssClass="input-block-level" required="required" placeholder="username" />
  <s:password name="password" cssClass="input-block-level" required="required" placeholder="Password" />
  <s:submit value="Sign in" cssClass="btn btn-success" />
  </s:form>
  </fieldset>
  </div>
  </div>
</div>
</div>  
</body>
</html>