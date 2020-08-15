package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.DormbuildDao;
import com.qf.pojo.Dormbuild;
import com.qf.service.DormbuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormbuildServiceImpl implements DormbuildService {

    @Autowired
    private DormbuildDao dormbuildDao;

    @Override
    public List<Dormbuild> findAll() {
        return dormbuildDao.selectList(null);
    }

    @Override
    public void add(Dormbuild dormbuild) {
        dormbuildDao.insert(dormbuild);
    }

    @Override
    public void add2(Dormbuild dormbuild) {
        dormbuildDao.insert(dormbuild);
    }

    @Override
    public void deleteById(String dormBuildId) {
        dormbuildDao.deleteById(dormBuildId);
    }

    @Override
    public void updateById(Dormbuild dormbuild) {
        dormbuildDao.updateById(dormbuild);
    }

    @Override
    public void updateDormbuild(Dormbuild dormbuild) {
        QueryWrapper<Dormbuild> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("dormBuildId",3);

        dormbuildDao.update(dormbuild,queryWrapper);
    }




}
