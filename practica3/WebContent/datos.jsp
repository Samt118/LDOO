<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="resultados.jsp" method="get">
		
		<img src="imagenes/gmail.png" width= "100"/>
		<label for="nombre">Nombre</label>
		<input type="text" name="nombre" placeholder="Escribe tu nombre">
		
		<label for="email">Email</label>
		<input type="email" name="email" placeholder="Escribe tu email">
		
		<label for="contrase�a">Contrase�a</label>
		<input type="password" name="contrase�a" placeholder="Escribe tu contrase�a">
		
		<label for="fecha">Fecha de nacimiento</label>
		<input type="date" name="fecha" placeholder="Escribe tu fecha de nacimiento">
		
		<input type="submit" value="Enviar">
		</form>
</body>
</html>