package project.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import project.model.Votes;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CrudVotesRepository extends JpaRepository<Votes, Integer> {

    @Transactional
    Votes save(Votes vote);

    @Transactional
    @Modifying
    @Query("DELETE FROM Votes v WHERE v.id=:id")
    int delete(@Param("id")int id);

    @Override
    Optional<Votes> findById(Integer integer);


    @Modifying
    @Query("SELECT v FROM Votes v WHERE v.restaurant.id=:resraurantId")
    List<Votes> getAllForRestaurant(int restaurantId);

}
