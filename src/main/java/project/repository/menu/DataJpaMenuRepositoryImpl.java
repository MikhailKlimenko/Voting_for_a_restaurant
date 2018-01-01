package project.repository.menu;

import project.model.Menu;

import java.util.List;

public class DataJpaMenuRepositoryImpl implements CrudMenuRepository {

    @Override
    public Menu save(Menu menu, int userId) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public List<Menu> getAll(int userId) {
        return null;
    }
}
