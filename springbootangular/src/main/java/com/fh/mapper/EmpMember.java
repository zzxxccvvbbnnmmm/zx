package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMember extends BaseMapper<Employee> {
}
