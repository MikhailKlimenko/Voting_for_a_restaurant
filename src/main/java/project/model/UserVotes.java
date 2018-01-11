package project.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "user")
public class UserVotes{

    @Id
    private BigInteger id;

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

    public UserVotes() {
    }

    public UserVotes(LocalDateTime dateTime, Restaurant restaurant) {
        this(null, dateTime, restaurant);
    }

    public UserVotes(BigInteger id, LocalDateTime dateTime,Restaurant restaurant) {
        this.id = id;
        this.localDateTime = dateTime;
        this.restaurant = restaurant;

    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
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
        return "UserVotes{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", user=" + user +
                ", restaurant=" + restaurant +
                '}';
    }
}
