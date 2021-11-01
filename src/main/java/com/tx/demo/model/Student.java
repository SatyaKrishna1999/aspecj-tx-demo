package com.tx.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by skoppart on 11/1/2021
 */
@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long databaseId;

    private String name;

    private String section;

    @ManyToMany(cascade = {CascadeType.PERSIST})
    @JoinTable(name = "student_project", joinColumns = {
            @JoinColumn(name = "student_id", foreignKey = @ForeignKey(name = "FK_STUDENT_PROJECT"))
    }, inverseJoinColumns = {
            @JoinColumn(name = "project_id", foreignKey = @ForeignKey(name = "FK_PROJECT_STUDENT"))
    })
    private List<Project> projects = new ArrayList<>(); // This class is the relationship owner.

    public Student(String name, String section) {
        this.name = name;
        this.section = section;
    }
}
