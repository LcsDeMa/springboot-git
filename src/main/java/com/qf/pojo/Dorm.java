package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dorm {
    private Integer dormId;
    private String dormBuildName;
    private Integer dormBuildId;
    private String dormName;
    private Integer dormNumber;
    private String dormType;
    private String tel;
}
