package project.service;

import org.springframework.stereotype.Component;
import project.model.User;

import java.util.List;

@Component
public interface UserService {

    User save(User user);

    boolean delete(int id);

    User get(int id);

    User getByEmail(String email);

    List<User> getAll();

}
