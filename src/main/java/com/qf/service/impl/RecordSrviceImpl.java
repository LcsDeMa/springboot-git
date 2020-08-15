package com.qf.service.impl;

import com.qf.dao.RecordDao;
import com.qf.pojo.Record;
import com.qf.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecordSrviceImpl implements RecordService {
    @Autowired
    private RecordDao recordDao;
    @Override
    public List<Record> findAll() {
        return recordDao.findAll();
    }

    @Override
    public Record findById(String recordId) {
        return recordDao.findById(recordId);
    }

    @Override
    public Integer addRecord(Record record) {
        return recordDao.addRecord(record);
    }

    @Override
    public Integer deleteById(String recordId) {
        return recordDao.deleteById(recordId);
    }

    @Override
    public Integer updateRecord(Record record) {
        return recordDao.updateRecord(record);
    }
}
