package dustin.hotel_search;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DonutResponse {

@JsonProperty("count")
private int count;

@JsonProperty("results")
private List<Donut> results;

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public List<Donut> getResults() {
	return results;
}

public void setResults(List<Donut> results) {
	this.results = results;
}



}
