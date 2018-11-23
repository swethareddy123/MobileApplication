<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri= "http://www.springframework.org/tags/form" prefix = "sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Mobile Details</h1>
<table>
<sf:form action = "updateMobileAction.obj" modelAttribute = "mobile">
<tr><td>Mobile Id :<sf:input path="mobileId" readonly = "true"/>
<tr><td>Mobile Name :<sf:input path="name"/>
<tr><td>Mobile Price :<sf:input path="price"/>
<tr><td>Mobile Quantity :<sf:input path = "quantity"/>
<tr><td><input type = "submit" value = "Update">
</sf:form>
</table>
</body>
</html>