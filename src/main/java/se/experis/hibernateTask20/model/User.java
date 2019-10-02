package se.experis.hibernateTask20.model;

import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    public User() {
        id=0;
        userName="PowerTim";
        password="SaltHash";
    }
}
