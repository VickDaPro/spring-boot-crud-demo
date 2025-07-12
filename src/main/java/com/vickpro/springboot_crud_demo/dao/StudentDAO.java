package com.vickpro.springboot_crud_demo.dao;

import com.vickpro.springboot_crud_demo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
