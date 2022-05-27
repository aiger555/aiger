package net.javaguides.sms.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

import net.javaguides.sms.entity.Role;

@Data
@Entity
@Table(name =  "users_roles")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))

    private Collection<Role> roles;

    public User(Long id, String firstName, String lastName, String email, String password, Collection<Role> roles) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.roles = roles;
    }

    public User() {

    }

    public <T> User(String firstName, String lastName, String email, String encode, List<T> role_user) {
    }
}
