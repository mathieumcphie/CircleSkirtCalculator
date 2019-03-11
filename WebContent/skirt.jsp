<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.circleskirt.dto.Skirt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Circle Skirt Result</title>
</head>
<body>

    <jsp:useBean id="skirt" class="com.circleskirt.dto.Skirt" scope="request"/>
	<jsp:getProperty name="skirt" property="innerRadius"/>
	<jsp:getProperty name="skirt" property="outerRadius"/>
	<jsp:getProperty name="skirt" property="arcAngle"/>	

</body>
</html>