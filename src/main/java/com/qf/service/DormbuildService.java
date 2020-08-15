package com.qf.service;


import com.qf.pojo.Dormbuild;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DormbuildService {


    List<Dormbuild> findAll();

    void add(Dormbuild dormbuild);

    void add2(Dormbuild dormbuild);

    void deleteById(String dormBuildId);

    void updateById(Dormbuild dormbuild);

    void updateDormbuild(Dormbuild dormbuild);
}
