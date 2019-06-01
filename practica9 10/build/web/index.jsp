<%-- 
    Document   : index
    Created on : 29/05/2019, 09:31:26 PM
    Author     : alext
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <div>
            <h1>Menu</h1>
            <form action='Registro' method='post'>
                <input type='submit' value='Registro'>
            </form>
            <form action="LoginAdmin" method="post">
                <input type="submit" value="Login Administrador"/>  
            </form>
            <form action="LoginNormal" method="post">
                <input type="submit" value="Login Usuario Normal"/>  
            </form>
            <form action="LoginInvitado" method="post">
                    <input type="submit" value="Login Invitado"/>  
            </form>
        </div>
    </body>
</html>
