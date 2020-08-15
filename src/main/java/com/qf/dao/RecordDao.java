package com.qf.dao;

import com.qf.pojo.Record;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecordDao {
    public List<Record> findAll();
    public Record findById(String recordId);
    public Integer addRecord(Record record);
    public Integer deleteById(String recordId);
    public Integer updateRecord(Record record);
}
