package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.LunchMenu;

import java.util.List;

@Repository
public class DataJpaMenuRepositoryImpl implements LunchMenuRepository {

    @Autowired
    private CrudMenuRepository crudMenuRepository;

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public LunchMenu save(LunchMenu lunchMenu, int restaurantId) {
        lunchMenu.setRestaurant(crudRestaurantRepository.getOne(restaurantId));
        return crudMenuRepository.save(lunchMenu);
    }

    @Override
    public boolean delete(int id) {
        return crudMenuRepository.delete(id);
    }

    @Override
    public LunchMenu get(int id) {
        return null;
    }

    @Override
    public List<LunchMenu> getAll() {
        return null;
    }

    @Override
    public List<LunchMenu> getAllForRestaurant(int restaurantId) {
        return null;
    }
}
