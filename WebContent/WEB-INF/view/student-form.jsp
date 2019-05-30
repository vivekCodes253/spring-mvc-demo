<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>
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
			<form:option value = "IND" label = "India"/>
			<form:option value = "AUS" label = "Australia"/>
			<form:option value = "NZ" label = "New Zealand"/>
			<form:option value = "SA" label = "South Africa"/>
				
		</form:select>
		
		<input type = "submit" value = "Submit"/>
		
		</form:form>
</body>
</html>