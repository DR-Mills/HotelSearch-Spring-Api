package dustin.hotel_search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutDetailResponse {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("ref")
	private String ref;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("calories")
	private int calories;
	
	@JsonProperty("extras")
	private List<String> extras;
	
	@JsonProperty("photo")
	private String photo;
	
	@JsonProperty("photo_attribution")
	private String photoAttribution;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public List<String> getExtras() {
		return extras;
	}

	public void setExtras(List<String> extras) {
		this.extras = extras;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPhotoAttribution() {
		return photoAttribution;
	}

	public void setPhotoAttribution(String photoAttribution) {
		this.photoAttribution = photoAttribution;
	}
	
	
}
