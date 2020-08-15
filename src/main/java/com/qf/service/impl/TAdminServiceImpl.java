package com.qf.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.dao.TAdminMapper;
import com.qf.pojo.TAdmin;
import com.qf.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auther: Lcs
 * @Date: 2020/8/15 09:59
 * @Description:
 */
@Service
public class TAdminServiceImpl implements TAdminService {
    @Autowired
    private TAdminMapper tAdminMapper;

    @Override
    public List<TAdmin> findAll() {
        return tAdminMapper.selectList(null);
    }

    @Override
    public TAdmin findById(String adminId) {
        return tAdminMapper.selectById(adminId);
    }

    @Override
    public List<TAdmin> findByName(String userName) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("userName",userName);
        return tAdminMapper.selectList(queryWrapper);
    }

    @Override
    public List<TAdmin> findByIds(String[] ids) {
        return tAdminMapper.selectBatchIds(Arrays.asList(ids));
    }

    @Override
    public Integer deleteById(String adminId) {
        return tAdminMapper.deleteById(adminId);
    }

    @Override
    public Integer updateById(TAdmin tAdmin) {
        return tAdminMapper.updateById(tAdmin);
    }

    @Override
    public Integer deleteByIds(String[] ids) {
        return tAdminMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public Integer insertById(TAdmin tAdmin) {
        return tAdminMapper.insert(tAdmin);
    }
}
