package project.repository;


import project.model.Restaurant;

import java.util.List;

public interface RestaurantRepository {

    Restaurant save(Restaurant r);

    boolean delete(int id);

    Restaurant get(int id);

    List<Restaurant> getAll();
}
