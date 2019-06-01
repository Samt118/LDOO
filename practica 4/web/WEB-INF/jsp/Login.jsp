<%-- 
    Document   : Login
    Created on : 31/05/2019, 07:35:17 PM
    Author     : alext
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method: "post" commandName="user">
		
		
		<label for="nombre">Nombre</label>
		<input type="text" name="Nombre" placeholder="Escribe tu nombre" form: input path="Nombre">
		
		<label for="email">Email</label>
		<input type="email" name="Email" placeholder="Escribe tu email" form: input path="Email">
		
		<label for="contraseña">Contraseña</label>
		<input type="password" name="Contrasena" placeholder="Escribe tu contraseña" form: password path="Contrasena">
		
		<label for="fecha">Fecha de nacimiento</label>
		<input type="date" name="Fecha" placeholder="Escribe tu fecha de nacimiento" form: date path="Fecha">
		
		<input type="submit" value="Enviar">
		</form>
</body>
</html>
