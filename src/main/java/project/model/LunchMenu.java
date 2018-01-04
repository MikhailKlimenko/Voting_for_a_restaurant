package project.model;

import java.util.Date;

public class LunchMenu extends AbstractBaseEntity {

    private String name;

    private Integer price;

    private Date registered = new Date();

    public LunchMenu() {}

    public LunchMenu(String name, Integer price) {
        this(null, name, price);
    }

    public LunchMenu(Integer id, String name, Integer price) {
        super(id);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                "name='" + name + '\'' +
                ", price=" + price +
                ", registered=" + registered +
                ", id=" + id +
                '}';
    }
}
