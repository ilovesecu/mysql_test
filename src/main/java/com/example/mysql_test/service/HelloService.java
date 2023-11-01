package com.example.mysql_test.service;

import com.example.mysql_test.repository.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloService {
    private final Mapper mapper;

    public String getTest(){
        return mapper.getTest();
    }

    public int getTestCnt(){
        return mapper.getTestCnt();
    }
}
