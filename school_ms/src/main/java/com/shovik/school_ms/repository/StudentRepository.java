package com.shovik.school_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shovik.school_ms.entity.Student;

//no need to add @Repository because JpaRepository has SimpleJpaRepository as default implem,entation oof the class which containts the @ Repository annotation

public interface StudentRepository extends JpaRepository<Student, Long> {

}
