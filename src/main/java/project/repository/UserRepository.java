package project.repository;

import project.model.User;

import java.util.List;

public interface UserRepository{

    User save(User user, int restaurantId);

    boolean delete(int id);

    User get(int id);

    User getByEmail(String email);

    List<User> getAll();
}
