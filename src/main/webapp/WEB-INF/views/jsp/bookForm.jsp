<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Nowa Książka</title>
</head>
<body>

<h1 style="color: red">${bookDetails}</h1>

<h1>Dodaj nową książkę</h1>
<form:form action="/bookForm" method="post" commandName="book" >
    <div>
        <form:label path="name">Nazwa Książki:</form:label>
        <br>
        <form:input id="name" path="name" type="text" />
    </div>
    <div>
        <form:label path="author">Autor:</form:label>
        <br>
        <form:input id="author" path="author" type="text" />
    </div>
    <div>
        <form:label path="year">Rok:</form:label>
        <br>
        <form:select id="year" path="year">
            <option>2010</option>
            <option>2014</option>
            <option>2016</option>
        </form:select>
    </div>
    <div>
        <form:label path="year">Twarda okładka?</form:label>
        <form:checkbox path="cover" />
    </div>

    <input type="submit" value="OK">

</form:form>

</body>
</html>