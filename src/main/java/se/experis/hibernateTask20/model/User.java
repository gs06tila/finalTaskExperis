package se.experis.hibernateTask20.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;


    public User(String userName, String password) {
        id=0;
        this.userName = userName;
        this.password = password;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @OneToMany( fetch = FetchType.LAZY, mappedBy = "user")
    private List<Characters> characters;

    public List<Characters> getCharacters() {
        return characters;
    }

}
