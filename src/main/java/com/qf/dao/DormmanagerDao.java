package com.qf.dao;

import com.qf.pojo.Dormmanager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DormmanagerDao {

    List<Dormmanager> findAll(String userName);

    void deleteById(Dormmanager dormmanager);

    void insert(Dormmanager dormmanager);

    void update(Dormmanager dormmanager);
}
