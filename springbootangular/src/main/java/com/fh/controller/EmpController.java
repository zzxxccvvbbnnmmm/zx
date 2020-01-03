package com.fh.controller;

import com.fh.common.CommonServeer;
import com.fh.model.Employee;
import com.fh.service.EmpService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("queryListEmp")
    public CommonServeer queryListEmp(){
        return empService.queryListEmp();
    }
    @RequestMapping("addEmp")
    public CommonServeer addEmp(@RequestBody Employee employee){
        return empService.addEmp(employee);
    }
    @RequestMapping("updateEmp")
    public CommonServeer updateEmp(@RequestBody Employee employee){
        return empService.updateEmp(employee);
    }
    @RequestMapping("getById")
    public CommonServeer getById(@RequestBody Integer id){
        return empService.getById(id);
    }
    @RequestMapping("deleteEmp")
    public CommonServeer deleteEmp(@RequestBody Integer id){
        return empService.deleteEmp(id);
    }
}
