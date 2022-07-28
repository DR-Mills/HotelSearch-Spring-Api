package dustin.hotel_search;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {
	
	@JsonProperty("srsName")
	private String srsName;

	@JsonProperty("location")
	private Location location;
	
	@JsonProperty("time")
	private Time time;
	
	@JsonProperty("data")
	private Data data;
	
	@JsonProperty("currentobservation")
	private CurrentObservation currentObservation;
	
	public String getSrsName() {
		return srsName;
	}

	public void setSrsName(String srsName) {
		this.srsName = srsName;
	}
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setCurrentObservation(CurrentObservation currentObservation) {
		this.currentObservation = currentObservation;
	}
	
	public CurrentObservation getCurrentObservation() {
		return currentObservation;
	}

	
	
	
}
