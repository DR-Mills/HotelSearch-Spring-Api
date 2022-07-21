<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results Page</title>
<link href="style.css" rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>

	<div class="header">
		<h1>Hotels in ${city}</h1>
	</div>

	<div class="container">

		<table class="table">

			<thead>
				<tr>
					<th scope="col"></th>
					<th scope="col">Hotel Name</th>
					<th scope="col">Price Per Night</th>
				</tr>
			</thead>
			<tbody>
				<c:set var="num" value="0" scope="page" />
				<c:forEach items="${hotels}" var="hotel">
					<c:set var="num" value="${num + 1}" scope="page" />
					<tr>
						<th scope="row"><c:out value='${pageScope.num}'/></th>
						<td>${hotel.hotelName}</td>
						<td><fmt:formatNumber value="${hotel.pricePerNight}" type="currency"/></td>
					</tr>
				</c:forEach>
			</tbody>

		</table>

	</div>


	<div class="homebutton">
		<a href="/">Go Back to Home Page</a>
	</div>


	<div class="footer">
		created by <a href="https://www.linkedin.com/in/dustinraemills">DR-Mills</a>
	</div>

</body>
</html>