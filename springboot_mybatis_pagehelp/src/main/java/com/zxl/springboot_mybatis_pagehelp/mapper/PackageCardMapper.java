package com.zxl.springboot_mybatis_pagehelp.mapper;

import com.zxl.springboot_mybatis_pagehelp.entity.PackageCard;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author zxl
 * @Date 2019-03-26 14:08
 */
@Repository
public interface PackageCardMapper {

    /**
     * 根据packageCard查询
     *
     * @param packageCard 实体
     */
    List<PackageCard> findPage(PackageCard packageCard);

}