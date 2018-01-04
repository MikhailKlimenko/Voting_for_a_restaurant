package project.model;


import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

public class User extends AbstractBaseEntity {
    private String name;
    private String email;
    private String password;
    private boolean enabled = true;
    private Date registered = new Date();
    private Set<Role> roles;

    public User() {
    }

    public User(Integer id, String name, String email, String password, Role role, Role... roles) {
        this(id, name, email, password,  true, EnumSet.of(role, roles));
    }

    public User(Integer id, String name, String email, String password, boolean enabled, Set<Role> roles) {
        super(id);
        this.email = email;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }
}
