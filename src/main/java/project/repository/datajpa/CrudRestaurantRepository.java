package project.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Restaurant;

import java.util.List;

public interface CrudRestaurantRepository extends JpaRepository<Restaurant, Integer> {

    Restaurant save(Restaurant restaurant);

    Restaurant delete(int id);


}
