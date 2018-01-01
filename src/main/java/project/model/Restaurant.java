package project.model;

public class Restaurant extends AbstractNamedEntity {

    private boolean enabledRestaurant = false;

    private Integer amount;

    public Restaurant(Integer id, String name, boolean enabledRestaurant) {
        super(id, name);
        this.enabledRestaurant = enabledRestaurant;
    }

    public boolean isEnabledRestaurant() {
        return enabledRestaurant;
    }

    public void setEnabledRestaurant(boolean enabledRestaurant) {
        this.enabledRestaurant = enabledRestaurant;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                " id = " + id +
                " name = " + name +
                " enabled = " +
                enabledRestaurant +
                " amount = " + amount +
                '}';
    }
}
