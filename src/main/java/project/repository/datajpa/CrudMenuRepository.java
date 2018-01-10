package project.repository.datajpa;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Menu;

import java.util.List;

public interface CrudMenuRepository extends JpaRepository<Menu, Integer> {

    Menu save(Menu menu);

    boolean delete(int id);

    List<Menu> getAll(int userId);


}
