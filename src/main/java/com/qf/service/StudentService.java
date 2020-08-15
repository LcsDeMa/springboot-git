package com.qf.service;

import com.qf.pojo.Student;

import java.util.List;

public interface StudentService {

    List selectAll();

    int addStudent(Student student);

    int deleteById(String stuNum);

    int deleteByIds(String[] stuNums);

    int updateStudent(Student student);

    Student selectById(String stuNum);

    List selectCondition(Student student);
}
