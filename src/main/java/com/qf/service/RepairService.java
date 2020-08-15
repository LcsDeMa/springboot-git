package com.qf.service;

import com.qf.pojo.Repair;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: lkp
 * @Date: 2020/8/15 16:43
 * @Description:
 */

public interface RepairService {
    void updateRepair(Repair repair);

    void updateById(Repair repairId);

    void deleteById(Integer repairId);

    void deleteByIds(Integer[] ids);

    void add(Repair repair);

    List<Repair> findAll();
}
