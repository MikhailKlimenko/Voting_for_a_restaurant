package project.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.Menu;
import project.repository.MenuRepository;
import project.repository.crud.CrudMenuRepository;
import project.repository.crud.CrudRestaurantRepository;

import java.util.List;

@Repository
public class DataJpaMenuRepositoryImpl implements MenuRepository {

    @Autowired
    private CrudMenuRepository crudMenuRepository;

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public Menu save(Menu menu, int restaurantId) {
        menu.setRestaurant(crudRestaurantRepository.getOne(restaurantId));
        return crudMenuRepository.save(menu);
    }

    @Override
    public boolean delete(int id) {
        return crudMenuRepository.delete(id) != 0;
    }

    @Override
    public Menu get(int id) {
        return crudMenuRepository.findById(id).orElse(null);
    }

    @Override
    public List<Menu> getAll() {
        return crudMenuRepository.findAll();
    }

    @Override
    public List<Menu> getAllForRestaurant(int restaurantId) {
        return null;
    }

}