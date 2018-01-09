package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.LunchMenu;

import java.util.List;

public interface CrudMenuRepository extends JpaRepository<LunchMenu, Integer> {

    LunchMenu save(LunchMenu lunchMenu);

    boolean delete(int id);

    List<LunchMenu> getAll(int userId);

}
