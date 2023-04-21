package co.develhope.hybernate.entities;

import javax.persistence.*;

@Entity
@Table
public class SchoolClass{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    String title;
    @Column(nullable = false)
    String description;


}