# HotelSearch-Spring-Api
Tasks:
Lab 7.2
Create a hotel search web app using Spring Boot and MongoDB. Be sure to use the exact names specified below.

Build Specifications:
Use springlabsDB as the database name.
Create a collection called hotels. Give it the following fields: id (String, the ID), hotelName (String), city (String), pricePerNight (Integer).
Create a Java entity for this table. Name it Hotel. It should have these properties: String id, String name, String city, Integer pricePerNight.
Add several documents to your collection with multiple hotels from at least 3 cities.
Build the following pages:
A home page that lets the user select from a drop down of the city they would like to stay in and then click a submit button. (Just hard-code the city options.)
When the user submits the city, display a results page that lists all the hotels in that city, including their name and price per night. Order the hotels by price. This page also includes a link back to do a new search.

Extended Challenges:
On the home page form, include a max price and incorporate it in the search results.
Draw the city drop down options from the database. **not completed
Add a form page to add hotels to the database. **not completed


Lab 8.1
Task: Work with an API that generates JSON data to display information on a web page. 

Specifications: 

Work with the following API: https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json
This API does not need a Key. It will give you weather forecast for a number of days.
Display the following information:
The areaDescription from the "location" section.
At least three (3) values from the "currentobservation" section.
The text for all the upcoming time ranges.
Try calling the API using different latitudes and longitudes. You can use text boxes to submit the data to the API.

Extended Challenges:
For the upcoming forecast, display multiple pieces of information together. For example the startPeriodName, temperature, iconLink (as the src of an <img>), and text.


Lab 8.2
Task:
Display a list of donut varieties from the API. Each donut includes a link to another page that shows more details for that donut.
Build Specifications:
Create a Spring MVC app. It does not require a database.
On the home page, display a list of the names of donuts from this API: https://grandcircusco.github.io/demo-apis/donuts.json. (Note this endpoint only gives the name and ID of each donut.)
Each name on the home page should be a link to a details page that displays the name, calories, photo (if available), and extras for that donut.For the details page, you can use the ID of the donut to fetch information from the details API endpoint. For example, donut #3 can be found at this URL https://grandcircusco.github.io/demo-apis/donuts/3.json. (Note this endpoint gives all the information about a donut.)
On the details page, provide a link back to the home page.

