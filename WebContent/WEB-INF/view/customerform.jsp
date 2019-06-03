<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Customer registration form</title>
	<style>
		.error{color:red}
	</style>
</head>
<body>
	<form:form action="processForm" modelAttribute = "customer">
		<br>First Name : <form:input path = "firstName"/>
		<br>Last Name(*) : <form:input path = "lastName"/>
		<form:errors path="lastName" cssClass="error"/>
		<br>Free passes (*) : <form:input path = "freePass"/>
		<form:errors path="freePass" cssClass="error"/>
		<br>Postal code : <form:input path = "postalCode"/>
		<form:errors path="postalCode" cssClass="error"/>
		<br>Course code : <form:input path = "courseCode"/>
		<form:errors path="courseCode" cssClass="error"/>
		
		<br>
		<input type="submit" value = "Submit"/>
	</form:form>
	

</body>
</html>
