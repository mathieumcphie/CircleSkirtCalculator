<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Circle Skirt Calculator</title>
</head>
<body>

<h1>Circle Skirt Calculator</h1>

Hello kitty, why not try this Circle Skirt Calculator out.
<p>Enter the following parameters and the required circle skirt dimensions are supplied.

<form action="results" method="post">
	Skirt Length [cm] <br/> <input type="text" name="skirtLength"/>
	<br/>
	Waist [cm]  <br/> <input type="text" name="waist"/>
	<br/>
	Silhouette Angle (from vertical) [deg] <br/> <input type="text" name="verticalAngle"/>
	<br/>
	<input type="submit" value="Submit"/>
</form>

</body>
</html>