package se.experis.hibernateTask20.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class ClassRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "class_id")
    private int id;

    @Column(name = "class_name")
    private String className;

    @Column(name = "abilities")
    private String abilities;

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public String getAbilities() {
        return abilities;
    }

    public ClassRole() {
        id=0;
        className = "test";
        abilities = "Fire";
    }

   @OneToMany( fetch = FetchType.LAZY, mappedBy = "classRole")
    private List<Characters> characters;

}
