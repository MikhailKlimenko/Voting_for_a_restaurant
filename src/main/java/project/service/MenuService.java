package project.service;

import project.model.Menu;
import project.util.exception.NotFoundException;

import java.util.List;

public interface MenuService {

    Menu update(Menu menu, int userId) throws NotFoundException;

    Menu create(Menu menu, int userId);

    void delete(int id) throws NotFoundException;

    Menu get(int id) throws NotFoundException;

    List<Menu> getAll();

    List<Menu> getAllForRestaurant(int restaurantId);
}
