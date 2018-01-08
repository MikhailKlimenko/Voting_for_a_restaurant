package project.repository.restaurant;


import java.util.List;

public interface RestaurantRepository {

    RestaurantRepository save(RestaurantRepository save);

    // false if not found
    boolean delete(int id, int userId);

    RestaurantRepository get(int id, int userId);

    List<RestaurantRepository> getAll();





//    User save(User user);
//
//    // false if not found
//    boolean delete(int id);
//
//    // null if not found
//    User get(int id);
//
//    // null if not found
//    User getByEmail(String email);
//
//    List<User> getAll();RestaurantRepository()
}
