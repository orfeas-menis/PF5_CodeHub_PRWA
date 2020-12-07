package pf5.codehub.team5.webapp.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "USER_ROLES")
public class UserRole {

    private static final int MAX_LENGTH_SHORT = 60;

    @Id
    @Column(name = "user_role_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    String name;

    @ManyToMany(mappedBy = "userRole")
    Set<User> users;

    public UserRole() {
    }

    public UserRole(String name, Set<User> users) {
        this.name = name;
        this.users = users;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
