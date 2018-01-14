package project.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.Votes;
import project.repository.VotesRepository;
import project.repository.crud.CrudRestaurantRepository;
import project.repository.crud.CrudUserRepository;
import project.repository.crud.CrudVotesRepository;

import java.util.List;

@Repository
public class DataJpaVotesRepositoryImpl implements VotesRepository {

    @Autowired
    private CrudVotesRepository crudVotesRepository;
    @Autowired
    private CrudUserRepository crudUserRepository;
    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;


    @Override
    public Votes save(Votes vote, int restaurantId, int userId) {
        vote.setUser(crudUserRepository.getOne(userId));
        vote.setRestaurant(crudRestaurantRepository.getOne(userId));
        return crudVotesRepository.save(vote);
    }

    @Override
    public boolean delete(int id) {
        return crudVotesRepository.delete(id) != 0;
    }

    @Override
    public Votes get(int id, int userId) {
        Votes votes = crudVotesRepository.findById(id).orElse(null);
        return votes != null && votes.getUser().getId() == userId ? votes : null;
    }

    @Override
    public List<Votes> getAll() {
        return crudVotesRepository.findAll();
    }

    @Override
    public List<Votes> getAllForRestaurant(int restaurantId) {
        return crudVotesRepository.getAllForRestaurant(restaurantId);
    }
}
