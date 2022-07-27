<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link href="style.css" rel="stylesheet">
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
</head>
<body>
	<div>
		<div class="header">
			<h1>Hotel Search</h1>
		</div>

		<div class="container main-search">
			<h2 style="padding: 30px">${msg}</h2>
			<form action="/resultsPage" method="post">
				<div class="row">
					<div class="col-md-6">
						<select required class="form-control" id="city" name="city">
							<option value="" disabled selected hidden>Select a City</option>
							<option value="Chicago">Chicago</option>
							<option value="Dubai">Dubai</option>
							<option value="Hannover">Hannover</option>
							<option value="London">London</option>
							<option value="Mexico City">Mexico City</option>
							<option value="New Orleans">New Orleans</option>
							<option value="Paris">Paris</option>
						</select>
					</div>
					<div class="col-md-6">
						Select Maximum Price Per Night </br> <input type="range"
							name="maxPerNight" id="maxPerNight" class="slider" value="10000"
							step="50" min="0" max="2000"
							oninput="this.nextElementSibling.value = this.value">
						<output>no maximum price</output>
					</div>
				</div>
				<input type="submit">
			</form>
		</div>

		<div class="container main-weather">
			<h3>
				<c:out value="${ weatherResponse.location.areaDescription }" />
				Weather
			</h3>
			<p>
				Currently, the weather is
				<c:out
					value="${ fn:toLowerCase(weatherResponse.currentObservation.weather) }" />
				with a temperature of
				<c:out value="${ weatherResponse.currentObservation.temp }" />
				and
				<c:out value="${ weatherResponse.currentObservation.winds }" />
				mph. winds.
			</p>

			<div class="row">

				<c:forEach var="i" begin="0" end="5" step="1">
					<div class="col-md-2" align="center">
						<div>
							<div>
								<h6>
									<c:out value="${ weatherResponse.time.startPeriodName.get(i) }" />
								</h6>
							</div>
							<img src="${ weatherResponse.data.iconLink.get(i) }"
								class="rounded">
							<p>
								<c:out value="${ weatherResponse.data.weather.get(i) }" />
							</p>
						</div>
					</div>
				</c:forEach>
			</div>
			last updated: ${ weatherResponse.currentObservation.date }

		</div>

		<div class="container giveMeSomeSpace">
			<h3>Please, Visit Our Sponsor!</h3>
			</br> <a href="https://grandcircusco.github.io/demo-apis"><img
				src="img/gcDoughnutShop.PNG" style="width: 35%; height: 35%"></a>

		</div>

		<div class="footer">
			created by <a href="https://www.linkedin.com/in/dustinraemills">DR-Mills</a>
		</div>
	</div>
</body>
</html>