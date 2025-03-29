<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Menu Information</title>
</head>
<body>
<h1>Menu Information</h1>
<table border="1">
    <tr>
        <th>Type</th>
        <th>Chef</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${menus}" var="menu">
        <tr>
            <td>${menu.type}</td>
            <td>${menu.chef}</td>
            <td><a href="/dishes?menu=${menu.id}">View Dishes</a><p><a href="/newMenu">Add New Menu</a></p></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
