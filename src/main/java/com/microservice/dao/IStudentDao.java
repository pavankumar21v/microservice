package com.microservice.dao;

import com.microservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentDao extends JpaRepository<Student, Long> {

}
