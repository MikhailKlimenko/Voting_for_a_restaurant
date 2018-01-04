package project.model;

public class LunchMenu extends AbstractNamedEntity {

    private long price;

    public LunchMenu() { }

    public LunchMenu(Integer id, String name, long price) {
        super(id, name);
        this.price = price;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "menu {" + " id = "
                + id + ", name = "
                + name + ", price = "
                + price + " }";
    }
}
