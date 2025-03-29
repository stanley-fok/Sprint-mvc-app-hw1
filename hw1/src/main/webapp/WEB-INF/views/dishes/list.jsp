<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Dish List</title>
</head>
<body>
<h1>Dish List</h1>
<table border="1">
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Dietary</th>
        <th>Rating</th>
    </tr>
    <c:forEach var="dish" items="${dishes}">
        <tr>
            <td>${dish.name}</td>
            <td>${dish.description}</td>
            <td>${dish.dietary}</td>
            <td>${dish.rating}</td>
        </tr>
    </c:forEach>
</table>
<!-- Link to add a new dish to the current menu -->
<p><a href="/newDish?menu=${menuId}">Add New Dish</a></p>


</body>
</html>
