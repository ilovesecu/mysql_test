package com.example.mysql_test.repository;

import org.apache.ibatis.annotations.Select;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {
    @Select("SELECT COUNT(*) FROM sweethome.test")
    int getTestCnt();

    @Select("SELECT pw FROM sweethome.test WHERE id = 'ilovepc'")
    String getTest();
}
