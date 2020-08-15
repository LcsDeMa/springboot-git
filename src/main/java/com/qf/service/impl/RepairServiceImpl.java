package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.RepairDao;
import com.qf.pojo.Repair;
import com.qf.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: libia
 * @Date: 2020/8/15 16:44
 * @Description:
 */
@Service
public class RepairServiceImpl implements RepairService {

    @Autowired
    private RepairDao repairDao;

    @Override
    public void updateRepair(Repair repair) {
        QueryWrapper<Repair> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("repairId",1);
        repairDao.update(repair,queryWrapper);
    }

    @Override
    public void updateById(Repair repairId) {
        repairDao.updateById(repairId);
    }

    @Override
    public void deleteById(Integer repairId) {
        repairDao.deleteById(repairId);
    }

    @Override
    public void deleteByIds(Integer[] ids) {
        repairDao.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public void add(Repair repair) {
        repairDao.insert(repair);
    }

    @Override
    public List<Repair> findAll() {
        return repairDao.selectList(null);
    }
}
