package com.qf.service.impl;

import com.qf.dao.DormDao;
import com.qf.pojo.Dorm;
import com.qf.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormServiceImpl implements DormService {

    @Autowired
    private DormDao dormDao;

    @Override
    public List<Dorm> findAll() {
        return dormDao.findAll();
    }

    @Override
    public Dorm findOne(Dorm dorm) {
        return dormDao.findOne(dorm);
    }

    @Override
    public int addDorm(Dorm dorm) {
        return dormDao.addDorm(dorm);
    }

    @Override
    public int deleteDorm(String dormId) {
        return dormDao.deleteDorm(dormId);
    }

    @Override
    public int updateDorm(String dormId) {
        return dormDao.updateDorm(dormId);
    }
}
