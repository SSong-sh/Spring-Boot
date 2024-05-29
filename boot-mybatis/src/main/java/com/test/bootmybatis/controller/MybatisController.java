package com.test.bootmybatis.controller;

import com.test.bootmybatis.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MybatisController {

    private final AddressMapper addressMapper;

    @Autowired
    public MybatisController(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

}
