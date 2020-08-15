package com.qf.service.impl;

import com.qf.dao.DormmanagerDao;
import com.qf.pojo.Dormmanager;
import com.qf.service.DormmanagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DormmanagerServiceImpl implements DormmanagerService {
    @Autowired
    private DormmanagerDao dormmanagerDao;

    @Override
    public List<Dormmanager> findAll(String userName) {
        return dormmanagerDao.findAll(userName);
    }

    @Override
    public void deleteById(Dormmanager dormmanager) {
        dormmanagerDao.deleteById(dormmanager);
    }

    @Override
    public void insert(Dormmanager dormmanager) {
        dormmanagerDao.insert(dormmanager);
    }

    @Override
    public void update(Dormmanager dormmanager) {
        dormmanagerDao.update(dormmanager);
    }
}
