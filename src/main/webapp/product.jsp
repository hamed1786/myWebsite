<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="product.js"></script>	//linking a java script file to product.jsp
	Welcome to shopping

	<form action="http://localhost:8080/checkout" method="post">		// form action get connected to CheckOutServlet through submit button and run a doPost method.
		<table style="width: 30%">

			<br>		
			<tr>
				<td>ProductName</td>									//ProductName Element
				<td><input id="pname" name="pname" type="text"></td>	//ProductName have a input text box.

			</tr>

			<tr>
				<td>Quantity</td>										//Quantity Element
				<td><input id="qty" name="qty" type="text"></td>		//Quantity have a input text box.
			</tr>

			<tr>
				<td>Price</td>											//Price Element.
				<td><input id="pri" name="pri" type="text"></td>		//Price have a input text box.
			</tr>

			<tr>
				<td></td>
				<td><label id="addToCart">Add to cart</label></td>		//Created a label for Add to cart for ajex query with id label element.
			</tr>

			<tr>
				<td><input type="Submit" value="check out"></td>		//Created a Submit button to send to CheckOutServlet.
			</tr>

		</table>
	</form>


</body>
<footer> </footer>
</html>







