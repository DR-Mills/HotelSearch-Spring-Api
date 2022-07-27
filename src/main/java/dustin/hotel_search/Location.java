package dustin.hotel_search;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Location {
	
	@JsonProperty("areaDescription")
    private String areaDescription;

	public String getAreaDescription() {
		return areaDescription;
	}

	public void setAreaDescription(String areaDescription) {
		this.areaDescription = areaDescription;
	}
 
    
}

