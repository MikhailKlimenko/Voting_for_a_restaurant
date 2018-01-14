package project.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.Restaurant;

import java.util.List;

@Repository
public class DataJpaRestaurantRepositoryImpl implements RestaurantRepository {

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;


    @Override
    public Restaurant save(Restaurant r) {
        return crudRestaurantRepository.save(r);
    }

    @Override
    public boolean delete(int id) {
        return crudRestaurantRepository.delete(id) != 0;
    }

    @Override
    public Restaurant get(int id) {
        return crudRestaurantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Restaurant> getAll() {
        return crudRestaurantRepository.findAll();
    }
}
