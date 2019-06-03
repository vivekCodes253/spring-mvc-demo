g<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student registration form</title>
</head>
<body>
		<form:form action = "processForm" modelAttribute = "student">
			First Name : <form:input path ="firstName"/>
			Last Name : <form:input path ="lastName"/>
			
		
		
		
		<form:select path = "country">
			<form:options items = "${student.countrylist}"/>
			
		</form:select>
		
		<br><br>
		Preferred alphabet<br>
		A <form:radiobutton path = "belief" value = "A"/><br>
		B <form:radiobutton path = "belief" value = "B"/><br>
		C <form:radiobutton path = "belief" value = "C"/><br>
		
		<br><br>
		Preferred number:<br>
		1 <form:checkbox path="multi" value ="1"/><br>
		2 <form:checkbox path="multi" value ="2"/><br>
		3 <form:checkbox path="multi" value ="3"/><br>
		4 <form:checkbox path="multi" value ="4"/><br>
		<br>
		<input type = "submit" value = "Submit"/>
		
		</form:form>
</body>
</html>