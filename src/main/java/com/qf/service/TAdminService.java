package com.qf.service;

import com.qf.pojo.TAdmin;


import java.util.List;

/**
 * @Auther: Lcs
 * @Date: 2020/8/11 12:30
 * @Description:
 */
public interface TAdminService {

    List<TAdmin> findAll();
    TAdmin findById(String adminId);

    List<TAdmin> findByName(String userName);

    List<TAdmin> findByIds(String[] ids);

    Integer deleteById(String adminId);

    Integer updateById(TAdmin tAdmin);

    Integer deleteByIds(String[] ids);

    Integer insertById(TAdmin tAdmin);
}
