package com.qf.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private Integer recordId;
    private String stuNum;
    private String name;
    private String dormBuildId;
    private String dormName;
    @JsonFormat(pattern = "yyyy-MM--dd",timezone = "GMT+8")
    private Date date;
    private String detail;
    private Dormbuild dormbuild;
}
