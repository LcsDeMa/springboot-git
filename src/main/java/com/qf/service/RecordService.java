package com.qf.service;

import com.qf.pojo.Record;

import java.util.List;

public interface RecordService {
    public List<Record> findAll();
    public Record findById(String recordId);
    public Integer addRecord(Record record);
    public Integer deleteById(String recordId);
    public Integer updateRecord(Record record);
}
