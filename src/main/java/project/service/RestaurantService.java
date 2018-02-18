package project.service;

import org.springframework.stereotype.Component;
import project.model.Restaurant;

import java.util.List;

@Component
public interface RestaurantService {

    Restaurant get(long id);

    void delete(long id);

    List<Restaurant> getAll();

    Restaurant update(Restaurant restaurant);

    Restaurant create(Restaurant restaurant);

}
