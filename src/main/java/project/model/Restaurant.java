package project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("JpaQlInspection")
@Entity
@Table(name = "restaurant")
public class Restaurant extends AbstractBaseEntity {

    private String description;


    public Restaurant() {
    }

    public Restaurant(Long id, String description) {
        super(id);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Restaurant{ " +
                " id = " + id +
                " ,description " + description +
                " }";
    }
}
