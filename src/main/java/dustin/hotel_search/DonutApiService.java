package dustin.hotel_search;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DonutApiService {

	private RestTemplate restTemplate = new RestTemplate();

	
	public DonutResponse getDonutResponse() {
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts.json";

		DonutResponse response = restTemplate.getForObject(url, DonutResponse.class);

		return response;
	}

	
	public DonutDetailResponse getDonutDetailResponse(int id) {
		
		String url = "https://grandcircusco.github.io/demo-apis/donuts/{0}.json";

		DonutDetailResponse response = restTemplate.getForObject(url, DonutDetailResponse.class, id);

		return response;
	}
	
}
