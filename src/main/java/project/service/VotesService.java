package project.service;

import project.model.Votes;
import project.util.exception.NotFoundException;

import java.util.List;

public interface VotesService {

    Votes create(Votes vote, int restaurantId, int userId);

    Votes update(Votes vote, int restaurantId, int userId) throws NotFoundException;

    void delete(int id) throws NotFoundException;

    Votes get(int id, int userId) throws NotFoundException;

    List<Votes> getAll();

    List<Votes> getAllForRestaurant(int restaurantId);
}
