package project.repository;


import project.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant save);

    boolean delete(int id, int userId);

    Restaurant get(int id, int userId);

    List<Restaurant> getAll();
}
