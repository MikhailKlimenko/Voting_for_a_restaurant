package project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("JpaQlInspection")
@Entity
@Table(name = "restaurant")
public class Restaurant extends AbstractBaseEntity {

    private String description;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    protected List<Menu> menuList;

    public Restaurant() {
    }

    public Restaurant(Integer id, String description) {
        super(id);
        this.description = description;
        menuList = new ArrayList<>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }


    @Override
    public String toString() {
        return "Restaurant{ " +
                " id = " + id +
                " ,description " + description +
                " }";
    }
}
