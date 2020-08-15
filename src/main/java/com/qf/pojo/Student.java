package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_student")
public class Student{

    @TableField("id")
    private Integer id;
    @TableId(value = "stuNum", type = IdType.NONE)
    private String stuNum;
    private String password;
    private String name;
    @TableField("dormBuildId")
    private Integer dormBuildId;
    @TableField("dormName")
    private String dormName;
    private String sex;
    private String tel;

    @TableField(exist = false)
    private Dormbuild dormbuild;


}
