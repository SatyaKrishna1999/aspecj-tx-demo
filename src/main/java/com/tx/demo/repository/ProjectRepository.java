package com.tx.demo.repository;

import com.tx.demo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by skoppart on 11/1/2021
 */
@Repository(value = "projectRepository")
public interface ProjectRepository extends JpaRepository<Project, Long> {

//    @Transactional(value = TxType.REQUIRED)
    List<Project> getByName(String name);
}
