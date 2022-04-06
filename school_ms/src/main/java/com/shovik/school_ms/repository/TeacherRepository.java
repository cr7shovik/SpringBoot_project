package com.shovik.school_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shovik.school_ms.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
