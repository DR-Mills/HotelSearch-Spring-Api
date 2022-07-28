package dustin.hotel_search;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiService {

	private RestTemplate restTemplate = new RestTemplate();

	public WeatherResponse getWeatherResponse() {
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
		
		return response;
	}
	
	
	public CurrentObservation getCurrentObservation() {
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
		
		return response.getCurrentObservation();
	}
	
	
	public Location getLocation() {
		
		String url = "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
		
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class);
		
		return response.getLocation();
	}
}
