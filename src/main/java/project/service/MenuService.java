package project.service;

import project.model.Menu;

import java.util.List;

public interface MenuService {

    Menu update(Menu menu, int userId);

    Menu create(Menu menu, int userId);

    boolean delete(int id);

    Menu get(int id);

    List<Menu> getAll();

    List<Menu> getAllForRestaurant(int restaurantId);
}
