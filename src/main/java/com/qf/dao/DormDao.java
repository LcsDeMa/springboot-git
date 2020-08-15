package com.qf.dao;

import com.qf.pojo.Dorm;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormDao {
    List<Dorm> findAll();
    Dorm findOne(Dorm dorm);
    int addDorm(Dorm dorm);
    int deleteDorm(String dormId);
    int updateDorm(String dormId);
}
