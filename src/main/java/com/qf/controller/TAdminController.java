package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TAdmin;
import com.qf.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: Lcs
 * @Date: 2020/8/11 12:31
 * @Description:
 */
@RestController
@RequestMapping("admin")
public class TAdminController {
    @Autowired
    private TAdminService tAdminService;
    @RequestMapping("findAll")
    public List<TAdmin> findAll(){
        List<TAdmin> tAdmins = tAdminService.findAll();
        return tAdmins;
    }
    @RequestMapping("findById")
    public TAdmin findAll(String adminId){
        TAdmin tAdmin = tAdminService.findById(adminId);
        return tAdmin;
    }
    @RequestMapping("deleteById")
    public Integer deleteById(String adminId){
        Integer delete = tAdminService.deleteById(adminId);
        return delete;
    }
    @RequestMapping("deleteByIds")
    public Integer deleteByIds(String[] ids){
        Integer deletes = tAdminService.deleteByIds(ids);
        return deletes;
    }
    @RequestMapping("updateById")
    public Integer updateById(){
        TAdmin tbMusic = new TAdmin();
        tbMusic.setAdminId("7");
        tbMusic.setUserName("hahahahah");
        Integer update = tAdminService.updateById(tbMusic);
        return update;
    }
    @RequestMapping("insertById")
    public Integer insertById(){
        TAdmin tbMusic = new TAdmin();
        tbMusic.setAdminId("20");
        tbMusic.setUserName("双截棍");
        Integer insert = tAdminService.insertById(tbMusic);
        return insert;
    }
    @RequestMapping("findByName")
    public List<TAdmin> findByName(String userName){
        List<TAdmin> musics = tAdminService.findByName(userName);
        return musics;
    }
    @RequestMapping("findByIds")
    public List<TAdmin> findByIds(String[] ids){
        List<TAdmin> musics = tAdminService.findByIds(ids);
        return musics;
    }
    @RequestMapping("findPage")
    public PageInfo findAll(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "1") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TAdmin> musicList = tAdminService.findAll();
        PageInfo<TAdmin> pageInfo = new PageInfo<>(musicList);
        return pageInfo;
    }

}
