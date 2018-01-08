package project.repository;

import project.model.LunchMenu;

import java.util.List;

public interface CrudMenuRepository {

    LunchMenu save(LunchMenu lunchMenu, int userId);

    boolean delete(int id, int userId);

    List<LunchMenu> getAll(int userId);

}
