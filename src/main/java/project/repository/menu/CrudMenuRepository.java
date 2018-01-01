package project.repository.menu;

import project.model.Menu;

import java.util.List;

public interface CrudMenuRepository {

    Menu save(Menu menu, int userId);

    boolean delete(int id, int userId);

    List<Menu> getAll(int userId);

}
