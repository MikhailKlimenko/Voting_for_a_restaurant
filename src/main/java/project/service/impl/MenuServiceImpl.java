package project.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Menu;
import project.repository.MenuRepository;
import project.service.MenuService;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu get(long id, long restaurantId) {

        return menuRepository.getMenuByRestaurant(id, restaurantId);
    }

    @Override
    public void delete(long id, long restaurantId) {

    }

    @Override
    public List<Menu> getAllByRestaurant(long id) {
        return null;
    }

    @Override
    public List<Menu> getAll(long id) {
        return null;
    }

    @Override
    public Menu update(Menu menu, long restaurantId) {
        return null;
    }

    @Override
    public Menu create(Menu menu, long restaurantId) {
        return null;
    }
}
