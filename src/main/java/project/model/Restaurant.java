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
public class Restaurant extends AbstractNamedEntity {

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "restaurant")
    protected List<LunchMenu> menuList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vote")
    private Set<User> votes;

    public Restaurant() {
    }

    public Restaurant(Integer id, String name) {
        super(id, name);
        menuList = new ArrayList<>();
        votes = new HashSet<>();
    }

    public List<LunchMenu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<LunchMenu> menuList) {
        this.menuList = menuList;
    }

    public Set<User> getVotes() {
        return votes;
    }

    public void setVotes(Set<User> votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Restaurant{ " +
                "id= " + id +
                " ,name " + name +
                "}";
    }
}
