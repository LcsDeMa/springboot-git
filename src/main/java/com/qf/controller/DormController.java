package com.qf.controller;

import com.qf.pojo.Dorm;
import com.qf.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dorm")
public class DormController {

    @Autowired
    private DormService dormService;

    @RequestMapping("findAll")
    public List<Dorm> findAll() {
        return dormService.findAll();
    }

    @RequestMapping("findOne")
    public Dorm findOne(Dorm dorm) {
        return dormService.findOne(dorm);
    }

    @RequestMapping("addDorm")
    public int addDorm(Dorm dorm) {
        return dormService.addDorm(dorm);
    }

    @RequestMapping("deleteDorm")
    public int deleteDorm(String dormId) {
        return dormService.deleteDorm(dormId);
    }

    @RequestMapping("updateDorm")
    public int updateDorm(String dormId) {
        return dormService.updateDorm(dormId);
    }
}
