package project.to;

public class Restaurant {

    private final Integer id;

    private String description;


    public Restaurant(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

}
