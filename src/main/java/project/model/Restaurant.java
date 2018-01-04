package project.model;

public class Restaurant extends AbstractBaseEntity{

    private String name;
    private Integer count;

    public Restaurant() {
    }

    public Restaurant(String name) {
        this(null, name);
    }

    public Restaurant(Integer id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

}
