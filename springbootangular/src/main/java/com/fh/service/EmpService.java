package com.fh.service;

import com.fh.common.CommonServeer;
import com.fh.model.Employee;

public interface EmpService {
    CommonServeer queryListEmp();

    CommonServeer addEmp(Employee employee);

    CommonServeer getById(Integer id);

    CommonServeer deleteEmp(Integer id);

    CommonServeer updateEmp(Employee employee);
}
