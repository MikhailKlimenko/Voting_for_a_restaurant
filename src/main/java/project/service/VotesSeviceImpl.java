package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.model.Votes;
import project.repository.VotesRepository;
import project.util.exception.NotFoundException;

import java.util.List;

@Service
public class VotesSeviceImpl implements VotesService {

    private final VotesRepository votesRepository;

    @Autowired
    public VotesSeviceImpl(VotesRepository votesRepository) {
        this.votesRepository = votesRepository;
    }

    @Override
    public Votes create(Votes vote, int restaurantId, int userId) {
        return votesRepository.save(vote, restaurantId, userId);
    }

    @Override
    public Votes update(Votes vote, int restaurantId, int userId) throws NotFoundException {
        return votesRepository.save(vote, restaurantId, userId);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        votesRepository.delete(id);
    }

    @Override
    public Votes get(int id, int userId) throws NotFoundException {
        return votesRepository.get(id, userId);
    }

    @Override
    public List<Votes> getAll() {
        return votesRepository.getAll();
    }

    @Override
    public List<Votes> getAllForRestaurant(int restaurantId) {
        return votesRepository.getAllForRestaurant(restaurantId);
    }
}
