package com.panda.complex.mapper;

import com.panda.complex.entity.Student;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    @Select("select * from student where sid=#{sid}")
    Student queryBySid(int sid);
}
