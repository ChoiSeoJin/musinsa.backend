package com.choiseojin.backend.product.repository;

import com.choiseojin.backend.product.dto.ProductDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {
    List<Map<String,Object>> selectLowestCategoryByProduct();
    List<Map<String,Object>> selectLowestBrandByProduct();
    List<Map<String,Object>> selectBrandMinMaxByCate(String cateNm);
    ProductDto selectProductOne(String productCd);
    int saveProduct(ProductDto productDto);
    int updateProduct(ProductDto productDto);
    int deleteProduct(String productCd);
}
