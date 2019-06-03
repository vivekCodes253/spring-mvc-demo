<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Customer confirmation form</title>
</head>
<body>
		Customer is confirmed ${customer.firstName} ${customer.lastName} ${customer.freePass} 
		${customer.postalCode} ${customer.courseCode}
		<br>
	
</body>
</html>