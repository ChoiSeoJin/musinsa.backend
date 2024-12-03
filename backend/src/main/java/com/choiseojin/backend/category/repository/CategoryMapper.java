package com.choiseojin.backend.category.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {
    int selectCategory(String strCateNm);
}
