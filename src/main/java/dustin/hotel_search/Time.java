package dustin.hotel_search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Time {

	@JsonProperty("startPeriodName")
	private List<String> startPeriodName;
	
	@JsonProperty("startValidTime")
	private List<String> startValidTime;
	
	@JsonProperty("tempLabel")
	private List<String> tempLabel;

	public List<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(List<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	public List<String> getStartValidTime() {
		return startValidTime;
	}

	public void setStartValidTime(List<String> startValidTime) {
		this.startValidTime = startValidTime;
	}

	public List<String> getTempLabel() {
		return tempLabel;
	}

	public void setTempLabel(List<String> tempLabel) {
		this.tempLabel = tempLabel;
	}
	
	
}
