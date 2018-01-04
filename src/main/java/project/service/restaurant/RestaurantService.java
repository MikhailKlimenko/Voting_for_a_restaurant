package project.service.restaurant;

import project.model.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant update(Restaurant restaurant, int userId);

    Restaurant create(Restaurant restaurant, int userId);

    boolean delete(int id, int userId);

    List<Restaurant> getAll(int userId);

    List<Restaurant> getAll();
}
