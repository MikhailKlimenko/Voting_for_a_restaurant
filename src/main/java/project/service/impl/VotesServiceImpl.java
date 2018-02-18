package project.service.impl;

import org.springframework.stereotype.Service;
import project.model.Votes;
import project.service.VotesService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class VotesServiceImpl implements VotesService {

    @Override
    public Votes get(long id, long userId) {
        return null;
    }

    @Override
    public void delete(long id, long userId) {

    }

    @Override
    public List<Votes> getAll(long userId) {
        return null;
    }

    @Override
    public List<Votes> getBetweenDates(LocalDate startDate, LocalDate endDate, long userId) {
        return null;
    }

    @Override
    public List<Votes> getBetweenDateTimes(LocalDateTime startDateTime, LocalDateTime endDateTime, long userId) {
        return null;
    }

    @Override
    public Votes update(Votes votes, long userId, long restaurantId) {
        return null;
    }

    @Override
    public Votes create(Votes votes, long userId, long restaurantId) {
        return null;
    }
}
