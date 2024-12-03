package com.choiseojin.backend.brand.repository;

import com.choiseojin.backend.brand.dto.BrandDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BrandMapper {
    int saveBrand(BrandDto brandDto);
    int updateBrand(BrandDto brandDto);
    int deleteBrand(String brandCd);
    BrandDto selectBrand(String brandNm);
    int deleteProduct(String brandCd);
}
