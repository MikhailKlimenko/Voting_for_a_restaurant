package project.repository;

import project.model.Votes;

import java.util.List;

public interface VotesRepository {

    Votes save(Votes vote, int restaurantId, int userId);

    boolean delete(int id);

    Votes get(int id,int userId);

    List<Votes> getAll();

    List<Votes> getAllForRestaurant(int restaurantId);
}
