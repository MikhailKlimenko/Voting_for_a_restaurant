package project.service.menu;

import project.model.LunchMenu;

import java.util.List;

public interface MenuService {

    LunchMenu update(LunchMenu lunchMenu, int userId);

    LunchMenu create(LunchMenu lunchMenu, int userId);

    boolean delete(int id, int userId);

    List<LunchMenu> getAll(int userId);

    List<LunchMenu> getAll();
}
