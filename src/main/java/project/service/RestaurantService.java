package project.service;

import project.model.Restaurant;
import project.util.exception.NotFoundException;

import java.util.List;

public interface RestaurantService {

    Restaurant update(Restaurant restaurant) throws NotFoundException;

    Restaurant create(Restaurant restaurant);

    void delete(int id) throws NotFoundException;

    Restaurant get(int id) throws NotFoundException;

    List<Restaurant> getAll();
}
