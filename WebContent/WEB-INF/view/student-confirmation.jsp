<%@ taglib prefix = "form"  uri = "http://www.springframework.org/tags/form" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Student confirmation form</title>
</head>
<body>
		Student is confirmed ${student.firstName} ${student.lastName} ${student.country} ${student.belief}
		<br>
		<ul>
		
		<c:forEach var = "inp" items = "${student.multi}">
			<li>${inp}<br></li>
		
		</c:forEach>
		
		
		</ul>

</body>
</html>