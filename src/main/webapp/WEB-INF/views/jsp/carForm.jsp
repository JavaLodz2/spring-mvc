<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Nowy samochód</title>
</head>
<body>

<h1 style="color: red">${carDetails}</h1>

<h1>Dodaj nowy samochód</h1>
<form action="/carForm" method="post">
    <div>
        <label for="name">Nazwa Samochodu:</label>
        <br>
        <input id="name" name="name" type="text">
    </div>
    <div>
        <label for="registration">Rejestracja:</label>
        <br>
        <input id="registration" name="registration" type="text">
    </div>
    <div>
        <label for="year">Rok:</label>
        <br>
        <select id="year" name="year">
            <option>2010</option>
            <option>2014</option>
            <option>2016</option>
        </select>
    </div>
    <div>
        <label for="year">Twarda okładka?</label>
        <input type="checkbox" name="hard">
    </div>
    <input type="submit" value="OK">

</form>

</body>
</html>