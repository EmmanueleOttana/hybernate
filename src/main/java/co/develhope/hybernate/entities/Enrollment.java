package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table
public class Enrollment{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    Student student;
    @ManyToOne
    SchoolClass schoolClass;

}