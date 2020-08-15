package com.qf.controller;

import com.qf.pojo.Record;
import com.qf.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("record")
public class RecordController {
    @Autowired
    private RecordService recordService;
    @RequestMapping("findAll")
    @ResponseBody
    public List<Record> findAll(){
        List<Record> records = recordService.findAll();
        System.out.println(records.toString());
        return records;
    }
    @RequestMapping("findById")
    @ResponseBody
    public Record findById(String recordId){
        System.out.println(recordId);
        Record record = recordService.findById(recordId);
        System.out.println(record.toString());
        return record;
    }
    @RequestMapping("deleteById")
    public String  deleteById(String recordId){
        System.out.println(recordId);
        Integer count = recordService.deleteById(recordId);
        if (count>0){
            System.out.println("删除成功");
            return "delete success";
        }else{
            System.out.println("删除失败");
            return "delete false";
        }

    }

    @RequestMapping("addRecord")
    @ResponseBody
    public String addRecord(Record record){
        System.out.println(record);
        Integer count = recordService.addRecord(record);
        if (count>0){
            System.out.println("添加成功");
            return "Add success";
        }else{
            System.out.println("添加失败");
            return "Add false";
        }
    }
    @RequestMapping("updateRecord")
    @ResponseBody
    public String updateRecord(Record record){
        System.out.println(record);
        Integer count = recordService.updateRecord(record);
        if (count>0){
            System.out.println("更新成功");
            return "Update success";
        }else{
            System.out.println("更新失败");
            return "Update false";
        }
    }

}
