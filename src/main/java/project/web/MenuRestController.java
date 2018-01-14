package project.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import project.model.Menu;
import project.service.MenuService;
import project.util.exception.NotFoundException;

import java.util.List;

@Controller
public class MenuRestController {
    private static final Logger log = LoggerFactory.getLogger(MenuRestController.class);

    private final MenuService menuService;

    @Autowired
    public MenuRestController(MenuService menuService) {
        this.menuService = menuService;
    }

    Menu update(Menu menu) {
        return null;
    }

    Menu create(Menu menu) {
        return null;
    }

    void delete(int id) {

    }

    Menu get(int id) {
        return null;
    }

    List<Menu> getAll() {
        return null;
    }

    List<Menu> getAllForRestaurant(int restaurantId) {
        return null;
    }
}
