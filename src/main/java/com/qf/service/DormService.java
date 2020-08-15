package com.qf.service;

import com.qf.pojo.Dorm;

import java.util.List;

public interface DormService {
    List<Dorm> findAll();
    Dorm findOne(Dorm dorm);
    int addDorm(Dorm dorm);
    int deleteDorm(String dormId);
    int updateDorm(String dormId);
}
