package com.example.mybatis_ex.mapper;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
@Transactional
class MemberMapperTest {
    @Autowired
    MemberMapper memberMapper;

//    @Test
//    void selectAllTest(){
//        assertThat(memberMapper.selectAll().size()).isEqualTo(5);
//
//        memberMapper.selectAll().forEach(mem -> log.info(mem.toString()));
//    }
}