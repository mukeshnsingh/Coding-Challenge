<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Summary</title>
</head>
<body>
	<form action="addService">
		Service Id&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="serviceId" /><br />
		Customer Name: <input type="text" name="customerName" /><br />
		Customer Address: <input type="text" name="shippingAddress" /><br />
		Product&nbsp;: <input type="text" name="orderItem" /><br />
		Total &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		: <input type="text" name="total" /><br />
		<input type="Submit"/><br />
	</form>
</body>
</html>