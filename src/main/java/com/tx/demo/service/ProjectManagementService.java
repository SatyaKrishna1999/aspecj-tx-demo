package com.tx.demo.service;

import com.tx.demo.model.Project;
import com.tx.demo.model.Student;
import com.tx.demo.repository.ProjectRepository;
import com.tx.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by skoppart on 11/1/2021
 */
@Service(value = "projectManagementService")
public class ProjectManagementService {

    @Autowired
    @Qualifier(value = "projectRepository")
    private ProjectRepository projectRepository;

    @Autowired
    @Qualifier(value = "studentRepository")
    private StudentRepository studentRepository;

    @Transactional(value = Transactional.TxType.REQUIRED)
    public void getCount() {
        System.out.println("1--------------------------");
        List<Project> projects = projectRepository.getByName("AI");
        System.out.println("2--------------------------");
        List<Student> students = studentRepository.getByName("Satya");
        System.out.println("3--------------------------");

        System.out.println(projects);
        System.out.println(students);
    }
}
