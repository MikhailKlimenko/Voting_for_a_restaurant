package project.repository;

import project.model.Menu;

import java.util.List;

public interface MenuRepository {
    project.model.Menu save(project.model.Menu menu, int restaurantId);

    boolean delete(int id);

    project.model.Menu get(int id);

    List<project.model.Menu> getAll();

    List<project.model.Menu> getAllForRestaurant(int restaurantId);

}
