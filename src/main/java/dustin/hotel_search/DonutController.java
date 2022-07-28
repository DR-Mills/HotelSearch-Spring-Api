package dustin.hotel_search;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DonutController {

	@Autowired
	DonutApiService apiService;

	@RequestMapping("/sponsor-gcdonuts")
	public String displayDonutHome(Model model) {
		
		DonutResponse dr = apiService.getDonutResponse();
		model.addAttribute("donutResponse", dr);
		
		return "welcomeDonut";
	}

	@RequestMapping("/donut-details")
	public String displayDonutDetails(Model model, @RequestParam int id) {
		
		DonutDetailResponse ddr = apiService.getDonutDetailResponse(id);
		
		model.addAttribute("donutDetail", ddr);
		
		return "donutDetail";
	}
}
