package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: Lcs
 * @Date: 2020/8/15 09:51
 * @Description:
 */
@Data
@TableName("t_admin")
public class TAdmin {

    @TableId(value = "adminId",type= IdType.NONE)
    private String adminId;

    @TableField("userName")
    private String userName;

    @TableField("password")
    private String password;

    @TableField("name")
    private String name;

    @TableField("sex")
    private String sex;

    @TableField("tel")
    private String tel;

}
