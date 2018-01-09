package project.repository;

import project.model.Restaurant;
import project.repository.CrudRestaurantRepository;

import java.util.List;

public class DataJpaRestaurantRepositoryImpl implements RestaurantRepository {

    @Override
    public Restaurant save(Restaurant save) {
        return null;
    }

    @Override
    public boolean delete(int id, int userId) {
        return false;
    }

    @Override
    public Restaurant get(int id, int userId) {
        return null;
    }

    @Override
    public List<Restaurant> getAll() {
        return null;
    }
}
