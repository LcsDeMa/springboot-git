package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.Dormmanager;
import com.qf.service.DormmanagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dormmanager")
public class DormmanagerController {
    @Autowired
    private DormmanagerService dormmanagerService;
    @RequestMapping("findAll")
    public PageInfo findAll(String userName, @RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "1") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Dormmanager> all = dormmanagerService.findAll(userName);
        PageInfo<Dormmanager> pageInfo = new PageInfo<Dormmanager>(all);



        return pageInfo;
    }

    @RequestMapping("delete")
    public void deleteById(Dormmanager dormmanager){
        dormmanagerService.deleteById(dormmanager);
    }

    @RequestMapping("insert")
    public void insert(Dormmanager dormmanager){
        dormmanagerService.insert(dormmanager);
    }
    @RequestMapping("update")
    public void update(Dormmanager dormmanager){
        dormmanagerService.update(dormmanager);
    }

}
