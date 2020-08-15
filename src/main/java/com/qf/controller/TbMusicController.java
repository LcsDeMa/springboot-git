package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.TbMusic;
import com.qf.service.TbMusicService;
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
@RequestMapping("music")
public class TbMusicController {
    @Autowired
    private TbMusicService tbMusicService;
    @RequestMapping("findAll")
    public List<TbMusic> findAll(){
        List<TbMusic> musicList = tbMusicService.findAll();
        return musicList;
    }
    @RequestMapping("findById")
    public TbMusic findAll(String musicId){
       TbMusic music = tbMusicService.findById(musicId);
       return music;
    }
    @RequestMapping("deleteById")
    public Integer deleteById(String musicId){
       Integer delete = tbMusicService.deleteById(musicId);
       return delete;
    }
    @RequestMapping("deleteByIds")
    public Integer deleteByIds(String[] ids){
       Integer deletes = tbMusicService.deleteByIds(ids);
       return deletes;
    }
    @RequestMapping("updateById")
    public Integer updateById(){
        TbMusic tbMusic = new TbMusic();
        tbMusic.setMusicId("7");
        tbMusic.setMusicName("hahahahah");
        Integer update = tbMusicService.updateById(tbMusic);
       return update;
    }
    @RequestMapping("insertById")
    public Integer insertById(){
        TbMusic tbMusic = new TbMusic();
        tbMusic.setMusicId("20");
        tbMusic.setMusicName("双截棍");
        Integer insert = tbMusicService.insertById(tbMusic);
       return insert;
    }
    @RequestMapping("findByName")
    public List<TbMusic> findByName(String musicName){
       List<TbMusic> musics = tbMusicService.findByName(musicName);
       return musics;
    }
    @RequestMapping("findByIds")
    public List<TbMusic> findByIds(String[] ids){
       List<TbMusic> musics = tbMusicService.findByIds(ids);
       return musics;
    }
    @RequestMapping("findPage")
    public PageInfo findAll(@RequestParam(defaultValue = "1") Integer pageNum,@RequestParam(defaultValue = "1") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TbMusic> musicList = tbMusicService.findAll();
        PageInfo<TbMusic> pageInfo = new PageInfo<>(musicList);
        return pageInfo;
    }

}
