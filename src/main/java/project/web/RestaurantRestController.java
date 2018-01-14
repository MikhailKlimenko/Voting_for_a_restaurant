package project.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import project.model.Restaurant;
import project.service.RestaurantService;

public class RestaurantRestController {
    private static final Logger log = LoggerFactory.getLogger(RestaurantRestController.class);

    private final RestaurantService restaurantService;

    public RestaurantRestController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    

}
