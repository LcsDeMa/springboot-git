package com.qf.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.pojo.Dormbuild;
import com.qf.service.DormbuildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dormBuild")
public class DormbuildController {

    @Autowired
    private DormbuildService dormbuildService;

    @RequestMapping("findAll")
        public List<Dormbuild> findAll() {
            List<Dormbuild> dormbuilds = dormbuildService.findAll();
            return dormbuilds;
    }

    @RequestMapping("insertNew")
        public void add() {
        Dormbuild dormbuild = new Dormbuild();
        dormbuild.setDormBuildId(2);
        dormbuild.setDormBuildName("2栋");
        dormbuild.setDormBuildDetail("这是二栋");
        dormbuildService.add(dormbuild);
    }

    @RequestMapping("insertNew2")
        public void add2() {
        Dormbuild dormbuild = new Dormbuild();
        dormbuild.setDormBuildId(3);
        dormbuild.setDormBuildName("3栋");
        dormbuild.setDormBuildDetail("这是三栋");
        dormbuildService.add2(dormbuild);
    }

    @RequestMapping("deleteById")
        public void deleteById(String dormBuildId) {
        dormbuildService.deleteById(dormBuildId);
    }

    @RequestMapping("updateById")
        public void updateById(Integer dormBuildId) {

        Dormbuild dormbuild1 = new Dormbuild();
        dormbuild1.setDormBuildId(dormBuildId);
        dormbuild1.setDormBuildName("3栋");
        dormbuild1.setDormBuildDetail("这是女宿舍");

        dormbuildService.updateById(dormbuild1);
    }

    @RequestMapping("updateDormbuild")
        public void updateDormbuild() {
        Dormbuild dormbuild = new Dormbuild();
        dormbuild.setDormBuildId(3);
        dormbuild.setDormBuildDetail("这是3栋女宿舍");

        dormbuildService.updateDormbuild(dormbuild);
    }

}
