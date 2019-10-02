package se.experis.hibernateTask20.model;

import javax.persistence.*;

@Entity
@Table
public class Characters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "name")
    private String name;

    @Column(name = "level")
    private int level;

    @Column(name = "class_id")
    private int classId;

    public Characters(){
        id=0;
        userId=1;
        name="Paladen";
        level=1;
        classId=1;
    }
}
