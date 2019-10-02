package se.experis.hibernateTask20.model;

import javax.persistence.*;

@Entity
@Table
public class ClassRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "class_name")
    private String className;

    @Column(name = "abilities")
    private String abilities;

    public ClassRole() {
        id=0;
        className = "test";
        abilities = "Fire";
    }
}
