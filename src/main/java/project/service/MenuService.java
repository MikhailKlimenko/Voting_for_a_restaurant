package project.service;

import org.springframework.stereotype.Component;
import project.model.Menu;

import java.util.List;

@Component
public interface MenuService {

    Menu get(long id, long restaurantId);

    void delete(long id, long restaurantId);

    List<Menu> getAllByRestaurant(long id);

    List<Menu> getAll(long id);

    Menu update(Menu menu, long restaurantId);

    Menu create(Menu menu, long restaurantId);

}
