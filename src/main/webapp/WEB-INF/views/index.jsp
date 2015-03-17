<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello ${user.username}!  
</h1>

<P>  How is the weather in ${user.country}? </P>
</body>
</html>
