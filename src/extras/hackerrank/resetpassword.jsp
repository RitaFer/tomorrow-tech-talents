<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Recuperacao de Senha</title>
</head>
<body>
<h1><%= "Recuperacao de Senha" %></h1>
<form action="createtoken.jsp">
    <input type="text" id="mail" name="mail">
    <br>
    <input type="text" id="user" name="user"/>
    <br>
    <input type="submit" value="Enviar"/>
</form>
<br/>
</body>
</html>