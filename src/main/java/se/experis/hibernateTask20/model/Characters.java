package se.experis.hibernateTask20.model;

import javax.persistence.*;
import java.util.List;

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

    @Column(name = "class_id", nullable=false)
    private int classId;

    public Characters(int userId, String name, int level, int classId){
        id=0;
        this.userId=userId;
        this.name=name;
        this.level=level;
        this.classId=classId;
    }

    public Characters() {
        id=0;
        userId = 1;
        name="timtimtim";
        level=2;
        classId=13;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getClassId() {
        return classId;
    }


    /*@ManyToOne(fetch = FetchType.LAZY)
            @JoinColumn(name = "user_id")
            private ClassRole classRole;*/
    @ManyToOne(optional = false)
    @JoinColumn(name = "class_id", referencedColumnName = "class_id", insertable = false, updatable=false)
    private ClassRole classRole;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;
}
