package com.panda.complex.controller;

import com.panda.complex.entity.Student;
import com.panda.complex.exception.BizException;
import com.panda.complex.exception.ResultBody;
import com.panda.complex.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent/{sid}")
    public ResultBody GetUser(@PathVariable int sid){
        Student student = studentService.queryById(sid);
        return ResultBody.success(student);
    }

    @RequestMapping("getReqMsg")
    public String GetJsonData(@RequestBody Map params){
        String str = null;
        str.equals("111");

        return (String) params.get("name");
    }

    @PostMapping("/insert")
    public boolean insert(@RequestBody Student student) {
        System.out.println("开始新增...");
        //如果姓名为空就手动抛出一个自定义的异常！
        if(student.getName()==null){
            throw  new BizException("用户姓名不能为空！");
        }
        return true;
    }

}
