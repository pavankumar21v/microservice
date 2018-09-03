package com.microservice.entities;

import lombok.Data;
import org.hibernate.annotations.SQLDelete;

import javax.persistence.*;

@Data
@Entity
@Table(name = "STUDENT")
@SQLDelete(sql = "UPDATE STUDENT SET IS_DELETED = 1")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COURSE")
    private String course;

    @Column(name = "FEE")
    private Double fee;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;
}
