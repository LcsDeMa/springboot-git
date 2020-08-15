package com.qf.service.impl;

import com.qf.dao.StudentDao;
import com.qf.pojo.Student;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public int addStudent(Student student){

       return studentDao.insert(student);

    }

    @Override
    public int deleteById(String stuNum) {
       return studentDao.deleteById(stuNum);
    }

    @Override
    public int deleteByIds(String[] stuNums) {
        return studentDao.deleteBatchIds(Arrays.asList(stuNums));
    }

    @Override
    public int updateStudent(Student student) {
        return studentDao.updateById(student);
    }

    @Override
    public Student selectById(String stuNum) {
        return studentDao.findById(stuNum);
    }

    @Override
    public List selectCondition(Student student) {
        return studentDao.selectCondition(student);
    }
}
