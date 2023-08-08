package com.multicampus.springex1.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {   //데이터베이스의 현재시각을 문자열로 받아와서 처리

    @Select("select now()")
    String getTime();

}
