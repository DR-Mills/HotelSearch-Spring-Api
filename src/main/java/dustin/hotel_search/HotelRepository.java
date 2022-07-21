package dustin.hotel_search;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String>{
	
	List<Hotel> findByCityAndPricePerNightLessThanEqual(String city, Sort sort, Integer pricePerNight);

	List<Hotel> findAll();
}
