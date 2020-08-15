package com.qf.controller;


import com.qf.pojo.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("selectAll")
    public List selectAll() {
        return studentService.selectAll();
    }


    @RequestMapping("selectById")
    public Student selectById(String stuNum) {
        return studentService.selectById(stuNum);
    }

    @RequestMapping("selectCondition")
    public List selectCondition(Student student){
        return studentService.selectCondition(student);
    }

    @RequestMapping("addStudent")
    public int addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @RequestMapping("deleteById")
    public int deleteById(String stuNum) {
        return studentService.deleteById(stuNum);
    }

    @RequestMapping("deleteByIds")
    public int deleteByIds(String[] stuNums) {
        return studentService.deleteByIds(stuNums);
    }

    @RequestMapping("updateStudent")
    public int updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

}
