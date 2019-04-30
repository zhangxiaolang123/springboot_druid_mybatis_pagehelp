package com.zxl.springboot_mybatis_pagehelp.controller;

import com.github.pagehelper.PageInfo;
import com.zxl.springboot_mybatis_pagehelp.entity.PackageCard;
import com.zxl.springboot_mybatis_pagehelp.service.PackageCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Describe
 * @Author zxl
 * @Date 2019-04-30 15:13
 */
@RestController
public class TestController {
    @Autowired
    private PackageCardService packageCardService;
    @GetMapping(value = "/getPackageCardList", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity getPackageCardList(String name,Integer pageNo,Integer pageSize) {
        PackageCard entity = new PackageCard();
        try {
            entity.setPackageCardName(name);
            PageInfo page = packageCardService.getPackageCardList(entity, pageNo, pageSize);
            return ResponseEntity.ok(page);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity("xxx", null, HttpStatus.EXPECTATION_FAILED);
        }
    }
}
