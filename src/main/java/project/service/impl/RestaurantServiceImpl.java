package project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Restaurant;
import project.repository.RestaurantRepository;
import project.service.RestaurantService;
import project.util.exception.NotFoundException;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public Restaurant update(Restaurant restaurant) throws NotFoundException {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        restaurantRepository.delete(id);
    }

    @Override
    public Restaurant get(int id) throws NotFoundException {
        return restaurantRepository.get(id);
    }

    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.getAll();
    }
}
