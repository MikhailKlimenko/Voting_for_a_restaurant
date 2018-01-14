package project.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import project.service.MenuService;
import project.service.RestaurantService;

@Controller
public class RestaurantMenuRestController {
    private static final Logger log = LoggerFactory.getLogger(RestaurantMenuRestController.class);

    private final MenuService menuService;

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantMenuRestController(MenuService menuService, RestaurantService restaurantService) {
        this.menuService = menuService;
        this.restaurantService = restaurantService;
    }


}
