package com.qf.controller;

import com.qf.pojo.Repair;
import com.qf.service.RepairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: lkp
 * @Date: 2020/8/15 16:42
 * @Description:
 */
@RestController
@RequestMapping("Repair")
public class RepairController {

    @Autowired
    private RepairService repairService;


    //根据条件修改
    @RequestMapping("updateRepair")
    public  void updateRepair(){
        Repair repair = new Repair();
        repair.setRepairId(1);
        repair.setDormName("221");
        repair.setDormBuildId(3);

        repairService.updateRepair(repair);

    }
    //根据id修改
    @RequestMapping("UpdateById")
    public void updateById(Integer repairId){
        Repair repair = new Repair();
        repair.setRepairId(repairId);
        repair.setDormName("221");
        repair.setName("ssm");

        repairService.updateById(repair);

    }
    //根据id删除
    @RequestMapping("deleteById")
    public void deleteById(Integer repairId){
        repairService.deleteById(repairId);

    }
    //批量删除
    @RequestMapping("deleteByIds")
    public void deleteByIds(Integer [] ids){
        repairService.deleteByIds(ids);
    }

    //添加
    @RequestMapping("add")
    public void add(){
        Repair repair = new Repair();
        repair.setDormName("223");
        repair.setDormBuildId(1);
        repair.setName("王五");

        repairService.add(repair);
    }
    //查询所有
    @RequestMapping("findAll")
    public List<Repair> findAll(){
        List<Repair> repairs = repairService.findAll();

        return  repairs;
    }
}
