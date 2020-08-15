package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("t_dormbuild")
public class Dormbuild implements Serializable {


    @TableId(value = "dormBuildId", type = IdType.AUTO)
    private Integer dormBuildId;

    @TableField("dormBuildName")
    private String dormBuildName;

    @TableField("dormBuildDetail")
    private String dormBuildDetail;


}
