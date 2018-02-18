package project.service.impl;

import org.springframework.stereotype.Service;
import project.model.User;
import project.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
