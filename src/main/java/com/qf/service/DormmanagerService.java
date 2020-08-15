package com.qf.service;

import com.qf.pojo.Dormmanager;

import java.util.List;

public interface DormmanagerService {
    List<Dormmanager> findAll(String userName);

    void deleteById(Dormmanager dormmanager);

    void insert(Dormmanager dormmanager);

    void update(Dormmanager dormmanager);
}
