package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Menu;
import project.repository.MenuRepository;
import project.service.MenuService;
import project.util.exception.NotFoundException;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Menu update(Menu menu, int userId) throws NotFoundException {
        return null;
    }

    @Override
    public Menu create(Menu menu, int userId) {
        return null;
    }

    @Override
    public void delete(int id) throws NotFoundException {

    }

    @Override
    public List<Menu> getAll() {
        return menuRepository.getAll();
    }

    @Override
    public Menu get(int id) throws NotFoundException {
        return null;
    }

    @Override
    public List<Menu> getAllForRestaurant(int restaurantId) {
        return null;
    }
}
