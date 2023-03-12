<%--
  Created by IntelliJ IDEA.
  User: robert
  Date: 12.03.2023
  Time: 09:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dodaj książkę </title>
</head>
<body>
<h1> Dodaj książkę </h1>
<form action = "/" method="post">
    <input type = "text" id="isbn" name = "isbn">
    <label for = "isbn"> ISBN: </label>
<br>
    <input type = "text" id="title" name = "title">
    <label for = "title"> Tytuł: </label>
    <br>
    <input type = "text" id="author" name = "author">
    <label for = "Author"> Autor: </label>
    <br>
    <input type = "text" id="publisher" name = "publisher">
    <label for = "publisher"> Wydawca: </label>
    <br>
    <input type = "text" id="type" name = "type">
    <label for = "type"> Rodzaj: </label>
</form>
</body>
</html>
