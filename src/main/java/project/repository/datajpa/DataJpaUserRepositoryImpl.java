package project.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import project.model.User;
import project.repository.UserRepository;

import java.util.List;

@Repository
public class DataJpaUserRepositoryImpl implements UserRepository {

    @Autowired
    private CrudUserRepository crudUserRepository;

    @Autowired
    private CrudRestaurantRepository crudRestaurantRepository;

    @Override
    public User save(User user, int restaurantId) {
        if (!user.isNew()) {
            user.setVote(crudRestaurantRepository.getOne(restaurantId));
        }
        return crudUserRepository.save(user);
    }

    @Override
    public boolean delete(int id) {
        return crudUserRepository.delete(id) != 0;
    }

    @Override
    public User get(int id) {
        return crudUserRepository.findById(id).orElse(null);
    }

    @Override
    public User getByEmail(String email) {
        return crudUserRepository.getByEmail(email);
    }

    @Override
    public List<User> getAll() {
        return crudUserRepository.findAll();
    }
}
