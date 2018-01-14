package project.util;

import project.model.Menu;
import project.to.Restaurant;

import java.util.Collection;
import java.util.List;

public class RestaurantUtil {

    public RestaurantUtil() {
    }

    public static List<Restaurant> getRestaurantWithMenuList(Collection<Menu> menu, project.model.Restaurant restaurant) {
        Restaurant restaurantWithMenu = new Restaurant(restaurant.getId(), restaurant.getDescription());

        return null;
    }
}
