package com.tx.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by skoppart on 11/1/2021
 */
@Entity
@Data
@NoArgsConstructor
public class Project {
    @Id
    @Column(name = "project_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long databaseId;

    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Student> students = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }
}
