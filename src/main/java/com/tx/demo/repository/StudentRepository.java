package com.tx.demo.repository;

import com.tx.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by skoppart on 11/1/2021
 */
@Repository(value = "studentRepository")
public interface StudentRepository extends JpaRepository<Student, Long> {

    @Transactional(value = Transactional.TxType.REQUIRES_NEW)
    List<Student> getByName(String name);
}
