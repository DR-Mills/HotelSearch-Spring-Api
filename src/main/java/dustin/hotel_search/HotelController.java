package dustin.hotel_search;

import java.util.List;

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
	
	@RequestMapping("/")
	public String showHomepage(@RequestParam(required = false) String msg) {
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
