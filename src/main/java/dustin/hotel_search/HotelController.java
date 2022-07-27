package dustin.hotel_search;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HotelController {

	@Autowired
	private HotelRepository repo;
	
	@Autowired
	private WeatherApiService apiService;
	
	@RequestMapping("/")
	public String showHomepage(Model model, @RequestParam(required = false) String msg) {
		
		WeatherResponse weatherResponse = apiService.getWeatherResponse();
		
		// modify date string to show only date and time with no other format changes
		String dateStr = weatherResponse.getCurrentObservation().getDate();
		String newDateStr = dateStr.substring(0, dateStr.length()-4);
		weatherResponse.getCurrentObservation().setDate(newDateStr);
		
		model.addAttribute("weatherResponse", weatherResponse);
		
		return "homepage";
	}
	
	
	@PostMapping("/resultsPage")
	public String showResults(@RequestParam String city, @RequestParam int maxPerNight, Model model) {
		
		List<Hotel> resultsList = repo.findByCityAndPricePerNightLessThanEqual(city, Sort.by(Sort.Direction.ASC, "pricePerNight"), maxPerNight);
		
		if(resultsList.size() < 1) {
			model.addAttribute("msg", "Sorry, there are no hotels in that price range. Please try a different city or a higher budget.");
			return "homepage";
		
		}
	
		model.addAttribute("city", city);
		model.addAttribute("hotels", resultsList);
		
		return "/resultsPage";
	}
}
