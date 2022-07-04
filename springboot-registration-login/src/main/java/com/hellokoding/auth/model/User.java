package com.hellokoding.auth.model;

import javax.persistence.*;
import java.util.Set;

@Entity
/*
 * @Entity is a JPA annotation which specifies the class as an entity
 * (so the class name can be used in JPQL queries)
 */

@Table(name = "user")

/*
 * @Table annotation with the name attribute specifies the table name 
 * in the underlying database for the annotated entity. 
 * If no @Table is defined, the class name of the entity 
 * will be used as the table name
 */
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    @Transient
    private String passwordConfirm;

    @ManyToMany
    private Set<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
