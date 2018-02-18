package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import project.model.Menu;

@Component
public interface MenuRepository extends JpaRepository<Menu, Long> {

}
