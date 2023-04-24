# **Weather service**
weather service
is a spring boot app that provides REST API endpoint that returns JSON with weather forecast for next 16 days based on Location provided.
***
## To start the application:
1. Download the file with project and unpack it

2. Import project as Maven project using your preffered IDE

3. In your IDE open package explorer and open "weather-service" project,
then go to "src/main/java" and open package "com.bartoszTanski.weatherservice"

4. Create MySQL database called "locations_db" 

5. Update MySQL database properties in file application.yaml (username, password, port if not default, MySQL db name if not p.4)

6. Open "WeatherServiceApplication.java" file in IDE and run it as java application

7. Application should start at localhost:8080

***
## To acces API endpoint:

1. Open browser

2. In page addres field write: "http://localhost:8080/api/v1/locations" 
-this endpoint will return all locations for which weather data can be fetched (few locations are added on application start)

3. In page addres field write: "http://localhost:8080/api/v1/weather?locationId={id}"
*where {id} is location id - choosen from locations list returned by endpoint at p.2
-this endpoint will return daily and hourly weather forecast data for next 14 days 
ex. http://localhost:8080/api/v1/weather?locationId=756135

4.You can search for locations by name using enpoint: "http://localhost:8080/api/v1/locations/search" and specifying parameters name and optionally country
-this endpoint will return all locations valid for regex {name} provided and (optionally) reduced to locations in choosen country 
ex. http://localhost:8080/api/v1/locations/search?name=wars&country=Poland

5.You can add custom location by using enpoint: "http://localhost:8080/api/v1/locations" with method POST using Postman and specifying parameters:
- name -name of City or location name  ex. Berlin / London / myHome 
- country - country name for the location ex. Germany
- latitude - latitude of location ex. 52.22977
- longitude - longitude of location ex. 21.01178
- timeZone - timezone of location (optional) ex. Europe/Warsaw

######  


## Application returns JSON object 

ex.
``` 
[
  {
    "id": 756135,   *use this id to search for weather data
    "name": "Warsaw",
    "country": "Poland",
    "latitude": 52.22977,
    "longitude": 21.01178,
    "timeZone": "Europe/Warsaw"
  }
]
```
