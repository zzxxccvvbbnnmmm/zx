package com.fh.service;

import com.fh.common.CommonServeer;
import com.fh.mapper.EmpMember;
import com.fh.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMember empMember;
    @Override
    public CommonServeer queryListEmp() {
        List<Employee> employeeList = empMember.selectList(null);
        return CommonServeer.success(employeeList);
    }

    @Override
    public CommonServeer addEmp(Employee employee) {
        empMember.insert(employee);
        return CommonServeer.success();
    }

    @Override
    public CommonServeer getById(Integer id) {
        Employee employee = empMember.selectById(id);
        return CommonServeer.success(employee);
    }

    @Override
    public CommonServeer deleteEmp(Integer id) {
        empMember.deleteById(id);
        return CommonServeer.success();
    }

    @Override
    public CommonServeer updateEmp(Employee employee) {
        empMember.updateById(employee);
        return CommonServeer.success();
    }
}
