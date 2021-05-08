package com.panda.complex.service;

import com.panda.complex.entity.Student;
import com.panda.complex.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional()
public class StudentService {
    @Autowired
    StudentMapper studentMapper;

    public Student queryById(int sid){
        return studentMapper.queryBySid(sid);
    }
}
