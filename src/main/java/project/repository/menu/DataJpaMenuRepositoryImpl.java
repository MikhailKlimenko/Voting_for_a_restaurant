package project.repository.menu;

import project.model.LunchMenu;
import project.repository.CrudMenuRepository;

import java.util.List;

public class DataJpaMenuRepositoryImpl implements CrudMenuRepository {

    @Override
    public LunchMenu save(LunchMenu lunchMenu, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public List<LunchMenu> getAll(int userId) {
        return null;
    }
}
