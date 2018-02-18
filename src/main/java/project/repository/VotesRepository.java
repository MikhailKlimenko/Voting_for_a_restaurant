package project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.model.Votes;

public interface VotesRepository extends JpaRepository<Votes, Long> {


}
