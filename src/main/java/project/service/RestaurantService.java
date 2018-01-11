package project.service;

import project.model.Restaurant;
import project.util.exception.NotFoundException;

import java.util.List;

public interface RestaurantService {

    Restaurant update(Restaurant restaurant, int userId);

    Restaurant create(Restaurant restaurant, int userId);

    boolean delete(int id, int userId) throws NotFoundException;

    List<Restaurant> getAll(int userId) throws NotFoundException;

    List<Restaurant> getAll() throws NotFoundException;
}
