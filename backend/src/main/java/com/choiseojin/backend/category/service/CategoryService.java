package com.choiseojin.backend.category.service;

import com.choiseojin.backend.category.repository.CategoryMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    //카테고리 여부 조회
    public int selectCategory(String strCate){
        return categoryMapper.selectCategory(strCate);
    }
}
