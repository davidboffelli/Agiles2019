<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AHORCADO MARADONA </title>
</head>
<body>
AHORCADO MARADONA
<form action="${pageContext.request.contextPath}/JuegoServlet" method="post">
	<div>
		<label type="text">Arriesgar letra: </label>
		<input type="text" id="letraIngresada" name="letraIngresada"></input>
		<button type="submit">Ingresar</button>
	</div>
	<div>
		<img id="img" alt="" src="">
	</div>
	<div>
		<label id="palabraAcertada" type="text">${estadoPalabra}</label>
	</div>
	<div>
		<label type="text">Letras erradas: ${stringLetras}</label>
		<label id="letrasErradas" type="text"></label>
	</div>
	<div>
		<label type="text">Vidas: ${vidas}</label>
	</div>
	<div>
		<label id="juegoGanado" type="text">${juegoFinalizado}</label>
	</div>
</form>
</body>
</html>