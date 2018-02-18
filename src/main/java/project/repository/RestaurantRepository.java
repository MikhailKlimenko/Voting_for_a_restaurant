package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Restaurant;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
