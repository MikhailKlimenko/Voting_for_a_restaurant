package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import project.model.Restaurant;
import project.model.Votes;

import java.util.List;
import java.util.Optional;

public interface CrudRestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Transactional
    Restaurant save(Restaurant r);

    @Transactional
    @Modifying
    @Query("DELETE FROM Votes v WHERE v.id=:id")
    int delete(@Param("id")int id);

    @Override
    Optional<Restaurant> findById(Integer id);


//    Restaurant save(Restaurant r);
//
//    boolean delete(int id);
//
//    Restaurant get(int id);
//
//    List<Restaurant> getAll();
}
