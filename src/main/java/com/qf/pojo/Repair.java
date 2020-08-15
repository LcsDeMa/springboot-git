package com.qf.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.util.Date;

/**
 * @Auther: lkp
 *  * @Date: 2020/8/15 16:23
 *  * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_repair")
public class Repair {
    @TableId(value = "repairId",type= IdType.NONE)
    private Integer repairId;
    @TableField("dormName")
    private String dormName;
    @TableField("dormBuildId")
    private Integer dormBuildId;
    @TableField("stuNum")
    private Integer stuNum;
    @TableField("name")
    private String name;
    @TableField("aplDate")
    private Date aplDate;
    @TableField("detail")
    private String detail;

}
