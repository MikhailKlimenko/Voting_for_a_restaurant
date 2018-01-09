package project.repository;

import project.model.LunchMenu;

import java.util.List;

public interface LunchMenuRepository {
    LunchMenu save(LunchMenu lunchMenu, int restaurantId);

    boolean delete(int id);

    LunchMenu get(int id);

    List<LunchMenu> getAll();

    List<LunchMenu> getAllForRestaurant(int restaurantId);

}
