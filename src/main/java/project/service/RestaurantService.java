package project.service;

import project.model.Restaurant;
import project.util.exception.NotFoundException;

import java.util.List;

public interface RestaurantService {

    Restaurant update(Restaurant restaurant);

    Restaurant create(Restaurant restaurant);

    boolean delete(int id) throws NotFoundException;

    List<Restaurant> getAll() throws NotFoundException;
}
