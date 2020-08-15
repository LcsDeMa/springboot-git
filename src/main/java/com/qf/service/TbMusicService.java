package com.qf.service;

import com.qf.pojo.TbMusic;

import java.util.List;

/**
 * @Auther: Lcs
 * @Date: 2020/8/11 12:30
 * @Description:
 */
public interface TbMusicService {

    List<TbMusic> findAll();
    TbMusic findById(String musicId);

    List<TbMusic> findByName(String musicName);

    List<TbMusic> findByIds(String[] ids);

    Integer deleteById(String musicId);

    Integer updateById(TbMusic tbMusic);

    Integer deleteByIds(String[] ids);

    Integer insertById(TbMusic tbMusic);
}
