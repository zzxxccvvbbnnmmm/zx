package com.fh.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * Created by 180297 on 2017/12/13.
 */
@Data
@TableName("employee1")
public class Employee {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String empname;

    private String gender;

    private String email;

    private Integer did;

}
