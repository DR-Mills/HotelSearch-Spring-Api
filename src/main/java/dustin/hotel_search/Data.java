package dustin.hotel_search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	@JsonProperty("temperature")
	private List<String> temperature;
	
	@JsonProperty("weather")
	private List<String> weather;
	
	@JsonProperty("iconLink")
	private List<String> iconLink;



	public List<String> getTemperature() {
		return temperature;
	}

	public void setTemperature(List<String> temperature) {
		this.temperature = temperature;
	}

	public List<String> getWeather() {
		return weather;
	}

	public void setWeather(List<String> weather) {
		this.weather = weather;
	}

	public List<String> getIconLink() {
		return iconLink;
	}

	public void setIconLink(List<String> iconLink) {
		this.iconLink = iconLink;
	}
	
	
}
