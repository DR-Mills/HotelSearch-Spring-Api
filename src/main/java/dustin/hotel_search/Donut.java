package dustin.hotel_search;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Donut {

	@JsonProperty("id")
	private int id;
	
	@JsonProperty("ref")
	private String ref;
	
	@JsonProperty("name")
	private String name;

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
}
