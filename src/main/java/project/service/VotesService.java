package project.service;

import org.springframework.stereotype.Component;
import project.model.Votes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Component
public interface VotesService {

    Votes get(long id, long userId);

    void delete(long id, long userId);

    List<Votes> getAll(long userId);

    default List<Votes> getBetweenDates(LocalDate startDate, LocalDate endDate, long userId) {
        return null;
    }

    default List<Votes> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, long userId) {
        return null;
    }

    Votes update(Votes votes, long userId, long restaurantId);

    Votes create(Votes votes, long userId, long restaurantId);


}
