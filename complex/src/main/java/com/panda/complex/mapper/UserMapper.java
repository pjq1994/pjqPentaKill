package com.panda.complex.mapper;

import com.panda.complex.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserMapper {
//    @Select("select * from user where id=#{id}")
    User queryById(int id);
}
