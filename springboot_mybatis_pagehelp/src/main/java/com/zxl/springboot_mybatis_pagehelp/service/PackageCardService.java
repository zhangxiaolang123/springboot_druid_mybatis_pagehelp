package com.zxl.springboot_mybatis_pagehelp.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zxl.springboot_mybatis_pagehelp.entity.PackageCard;
import com.zxl.springboot_mybatis_pagehelp.mapper.PackageCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author：zxl
 * @Date：2019/3/15
 * @Description：套餐卡产品
 */
@Service
public class PackageCardService {
    @Autowired
    private PackageCardMapper packageCardMapper;


    public PageInfo getPackageCardList(PackageCard entity, Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        List<PackageCard> page = packageCardMapper.findPage(entity);
        return new PageInfo(page);
    }
}
