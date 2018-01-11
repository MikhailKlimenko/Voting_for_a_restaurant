package project.repository;


import project.model.Menu;

import java.util.List;

public interface MenuRepository {

    Menu save(Menu menu, int restaurantId);

    boolean delete(int id);

    Menu get(int id);

    List<Menu> getAll();

    List<Menu> getAllForRestaurant(int restaurantId);

}
