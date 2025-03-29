<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
    <title>New Menu</title>
</head>
<body>
<h1>Create New Menu</h1>

<form:form modelAttribute="menu" action="/addMenu" method="post">
    <div>
        <form:label path="type">Type:<form:input path="type" id="type"/></form:label>
        <form:errors path="type"/><br/>
    </div>
    <div>
        <form:label path="chef">Chef:<form:input path="chef" id="chef"/></form:label>
        <form:errors path="chef"/><br/>
    </div>
    <div>
        <form:label path="id">ID:<form:input path="id" id="id"/></form:label>
        <form:errors path="id"/><br/>
    </div>
    <button type="submit">Add Menu</button>
</form:form>
</body>
</html>
