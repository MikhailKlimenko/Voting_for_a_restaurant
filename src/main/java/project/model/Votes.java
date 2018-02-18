package project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table
public class Votes extends AbstractBaseEntity{

    @Column(name = "datetime", nullable = false)
    @NotNull
    private LocalDateTime localDateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @NotNull
    private Restaurant restaurant;

    public Votes() {
    }

    public Votes(Long id, LocalDateTime dateTime, Restaurant restaurant) {
        super(id);
        this.localDateTime = dateTime;
        this.restaurant = restaurant;
    }


    public LocalDateTime getDateTime() {
        return localDateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.localDateTime = dateTime;
    }

    public LocalDate getDate() {
        return localDateTime.toLocalDate();
    }

    public LocalTime getTime() {
        return localDateTime.toLocalTime();
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Votes{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
