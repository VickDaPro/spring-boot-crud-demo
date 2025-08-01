package com.vickpro.springboot_crud_demo.dao;

import com.vickpro.springboot_crud_demo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByFirstName(String theFirstName);

    void update(Student theStudent);

    void delete(Integer id);

    int deleteAll();
}
