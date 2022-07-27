package dustin.hotel_search;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

	@JsonProperty("Date")
	private String date;
	
	@JsonProperty("Temp")
	private String temp;
	
	@JsonProperty("Weather")
	private String weather;
	
	@JsonProperty("Weatherimage")
	private String weatherImage;
	
	@JsonProperty("Winds")
	private String winds;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWeatherImage() {
		return weatherImage;
	}

	public void setWeatherImage(String weatherImage) {
		this.weatherImage = weatherImage;
	}

	public String getWinds() {
		return winds;
	}

	public void setWinds(String winds) {
		this.winds = winds;
	}
	
	
}
