# **Surfers weather service**
Surfers weather service
is a spring boot app that provides REST API endpoint that returns best localization for surfing and current weather conditions there.
***
## To start the application:
1. Download the file with project and unpack it

2. Import project as Maven project using your preffered IDE

3. In your IDE open package explorer and open "weather-service" project,
then go to "src/main/java" and open package "com.bartoszTanski.weatherservice"

4. Open "WeatherServiceApplication.java" file in IDE and run it as java application

5. Application should start at localhost:8080
***
## To acces API endpoint:

1. Open browser

2. In page addres field write: "http://localhost:8080/api/v1/weather/{date}" where {date}* is in format **YYYY-MM-DD**
######   *date range is 16 days from current day

ex.
```
http://localhost:8080/api/v1/weather/2023-03-08
```		

3. Application returns JSON object 

ex.
``` 
{
 "locationName":"Fortaleza",
 "country":"BR",
 "temperature":26.9,
 "windSpeed":5.5
}
```
### where:
###### **"locationName"** is name of location for which weather forecast is given
###### **"country"** is two letters ISO country code      (_[for ISO country codes look here](https://countrycode.org "countrycode.org")_)
###### **"temperature"** is temperature in degrees Celcius
###### **"windSpeed"** is wind speed in meters per second (m/s)
