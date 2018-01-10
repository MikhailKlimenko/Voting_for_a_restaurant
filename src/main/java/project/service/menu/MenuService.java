package project.service.menu;

import project.model.Menu;

import java.util.List;

public interface MenuService {

    Menu update(Menu menu, int userId);

    Menu create(Menu menu, int userId);

    boolean delete(int id, int userId);

    List<Menu> getAll(int userId);

    List<Menu> getAll();
}
