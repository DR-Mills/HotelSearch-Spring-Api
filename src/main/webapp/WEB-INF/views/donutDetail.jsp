<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${ donutDetail.name }</title>
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
				<h1>${ donutDetail.name }</h1>
			</div>

			<div class="container giveMeSomeSpace">
				<div class="row">
					<div class="col-md-4">
						<img src="${ donutDetail.photo }" class="img-fluid max-width">
					</div>
					<div class="col-md-8">
						<h4>Name: ${ donutDetail.name }</h4>
						<h4>Calories: ${ donutDetail.calories }</h4>
						<h4>Extras: </h4>
							<ul>
							<c:forEach items="${ donutDetail.extras }" var="i">
								<li>${ i }</li>
							</c:forEach>
						</ul>
						
					</div>
				</div>	
			</div>
			
			<div class="giveMeSomeSpace text-center">
				<a class="btn btn-primary" href="/sponsor-gcdonuts">Back to Donut Menu</a>
				<a class="btn btn-secondary" href="/">Back to Home Page</a>
			</div>
		</div>

		<footer class="footer">
			created by <a href="https://www.linkedin.com/in/dustinraemills">DR-Mills</a>
		</footer>

	</div>
</body>
</html>