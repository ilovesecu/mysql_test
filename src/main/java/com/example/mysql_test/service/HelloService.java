package com.example.mysql_test.service;

import com.example.mysql_test.repository.Mapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class HelloService {
    private final Mapper mapper;

    public String getTest(){
        log.error("asdasdsa111 test");
        return mapper.getTest();
    }

    public int getTestCnt(){
        log.error("asdasdsa2222 test cnt");
        return mapper.getTestCnt();
    }
}
