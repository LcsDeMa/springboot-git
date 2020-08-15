package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.qf.dao.TbMusicMapper;
import com.qf.pojo.TbMusic;
import com.qf.service.TbMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Lcs
 * @Date: 2020/8/11 12:30
 * @Description:
 */
@Service
public class TbMusicServiceImpl implements TbMusicService {
    @Autowired
    private TbMusicMapper tbMusicMapper;
    @Override
    public List<TbMusic> findAll() {
        return tbMusicMapper.selectList(null);
    }
    @Override
    public TbMusic findById(String musicId) {
        return tbMusicMapper.selectById(musicId);
    }

    @Override
    public List<TbMusic> findByName(String musicName) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("music_name",musicName);
        return tbMusicMapper.selectList(queryWrapper);
    }

    @Override
    public List<TbMusic> findByIds(String[] ids) {
        return tbMusicMapper.selectBatchIds(Arrays.asList(ids));
    }

    @Override
    public Integer deleteById(String musicId) {
        return tbMusicMapper.deleteById(musicId);
    }

    @Override
    public Integer updateById(TbMusic tbMusic) {
        return tbMusicMapper.updateById(tbMusic);
    }

    @Override
    public Integer deleteByIds(String[] ids) {
        return tbMusicMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public Integer insertById(TbMusic tbMusic) {
        return tbMusicMapper.insert(tbMusic);
    }

}
