package com.qf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentDao extends BaseMapper<Student> {

    List<Student> selectAll();

    List selectCondition(Student student);

    Student findById(String stuNum);
}
