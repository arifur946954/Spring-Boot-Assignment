package com.CRUD.Assignment.dao;

import com.CRUD.Assignment.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
