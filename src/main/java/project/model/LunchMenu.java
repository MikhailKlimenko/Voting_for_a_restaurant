package project.model;

import java.util.Date;

public class LunchMenu extends AbstractBaseEntity {

    private String description;

    private Integer price;

    private Date registered = new Date();

    public LunchMenu() {}

    public LunchMenu(String description, Integer price) {
        this(null, description, price);
    }

    public LunchMenu(Integer id, String description, Integer price) {
        super(id);
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "LunchMenu{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", registered=" + registered +
                ", id=" + id +
                '}';
    }
}
