<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Doughnut Lover</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link href="style.css" rel="stylesheet">
</head>
<body>
	<div class="page-container">
	<div class="content-wrap">
	<div class="header">
		<h1>Donuts</h1>
	</div>

	<div class="container">
		<ul>
			<c:forEach items="${ donutResponse.results }" var="donut">
				<li><a href="/donut-details?id=${donut.id}"><h3>${ donut.name }</h3></a></li>
			</c:forEach>
		</ul>
	</div>


			<div class="giveMeSomeSpace text-center">
				<a class="btn btn-secondary" href="/">Back to Home Page</a><br>
			</div>
</div>

		<footer class="footer">
			created by <a href="https://www.linkedin.com/in/dustinraemills">DR-Mills</a>
		</footer>

</div>
</body>
</html>