<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>New Dish</title>
</head>
<body>
<h1>Add New Dish</h1>

<form:form modelAttribute="dish" action="/addDish?menu=${menuId}" method="post">
    <div>
        <form:label path="name">Name:<form:input path="name" id="name"/></form:label>
        <form:errors path="name"/><br/>
    </div>
    <div>
        <form:label path="description">Description:<form:input path="description" id="description"/></form:label>
        <form:errors path="description"/><br/>
    </div>
    <div>
        <form:label path="dietary">Dietary:<form:input path="dietary" id="dietary"/></form:label>
        <form:errors path="dietary"/><br/>
    </div>
    <div>
        <form:label path="rating">Rating: <form:input path="rating" id="rating" type="number"/></form:label>
        <form:errors path="rating"/><br/>
    </div>
    <button type="submit">Add Dish</button>
</form:form>
</body>
</html>
