package project.repository;

import project.model.Restaurant;

import java.util.List;

public interface CrudRestaurantRepository {
    Restaurant save(Restaurant restaurant);

    Restaurant delete(int id, int userId);

    Restaurant get(int id, int userId);

    List<Restaurant> getAll(int userId);

}
