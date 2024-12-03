package com.choiseojin.backend.product.service;

import com.choiseojin.backend.brand.repository.BrandMapper;
import com.choiseojin.backend.brand.service.BrandService;
import com.choiseojin.backend.category.repository.CategoryMapper;
import com.choiseojin.backend.category.service.CategoryService;
import com.choiseojin.backend.product.dto.ProductDto;
import com.choiseojin.backend.product.repository.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;
    DecimalFormat df = new DecimalFormat("###,###");
    //카테고리별 최저가 조회
    public Map<String,Object> lowestProductList () {
        Map<String,Object> returnMap = new HashMap<>();
        List<Map<String,Object>> lowestCategoryByProduct = productMapper.selectLowestCategoryByProduct();
        long sum = lowestCategoryByProduct.stream().mapToLong((e)->(Long)e.getOrDefault("가격",0L)).sum();

        returnMap.put("총액",df.format(sum));
        returnMap.put("데이터",lowestCategoryByProduct);

        return returnMap;
    }

    //최저가 브랜드 조회
    public Map<String,Object> lowestBrandProductList() {
        Map<String,Object> returnMap = new HashMap<>();
        Map<String,Object> innerMap = new HashMap<>();
        List<Map<String,Object>> lowestBrandByProduct = productMapper.selectLowestBrandByProduct();
        if(!lowestBrandByProduct.isEmpty()) {
            BigDecimal bigDecimal = (BigDecimal) lowestBrandByProduct.get(0).get("총액");
            String strBrand = (String)lowestBrandByProduct.get(0).getOrDefault("브랜드","");
            innerMap.put("총액",df.format(bigDecimal));
            innerMap.put("브랜드",strBrand);
            innerMap.put("카테고리",lowestBrandByProduct);
            returnMap.put("최저가",innerMap);
        }

        return returnMap;
    }

    //최저가, 최고가 브랜드 조회
    public Map<String, Object> brandMinMaxByCate(String cate) {
        Map<String,Object> returnMap = new HashMap<>();
        if(!cate.isBlank()){
            List<Map<String,Object>> brandByProductPriceData = productMapper.selectBrandMinMaxByCate(cate);
            returnMap.put("카테고리",cate);
            if(!brandByProductPriceData.isEmpty()){
                for(Map<String,Object> data : brandByProductPriceData){
                    if(data.getOrDefault("TYPE","").equals("MIN")){
                        returnMap.put("최저가",data);
                    }else if(data.getOrDefault("TYPE","").equals("MAX")){
                        returnMap.put("최고가",data);
                    }
                    data.remove("TYPE");
                }
            }else {
                returnMap.put("error", "상품이 없습니다.");
            }
        }
        return returnMap;
    }
    //상품 한개 조회
    public ProductDto selectProductOne(String productCd){
        if(!productCd.isBlank()){
            return productMapper.selectProductOne(productCd);
        }else {
            return new ProductDto();
        }
    }

    //상품 저장
    public String saveProduct(ProductDto productDto){
        int categoryCount = categoryService.selectCategory(productDto.getCateNm());
        int brandCount = brandService.selectBrand(productDto.getBrandNm()) == null ? 0 : 1;
        String resultCd = "200";
        if(productDto.getProductCd() == null || productDto.getProductNm() == null || productDto.getPrice() == null ){
            resultCd = "206";
        } else if(productDto.getProductCd().length() > 10){
            resultCd = "205";
        }else if(productMapper.selectProductOne(productDto.getProductCd()) == null  ){
            if( brandCount == 0 && categoryCount == 0  ){
                //카테고리/브랜드 모두 미존재
                resultCd = "201";
            }else if (categoryCount== 0 ){
                //카테고리 미존재
                resultCd = "202";
            }else if(brandCount ==0){
                //브랜드 미존재
                resultCd = "203";
            }else {
                //카테고리 브랜드 모두존재
                resultCd = productMapper.saveProduct(productDto) > 0 ? "200" : "999";
            }
        } else{
            resultCd = "204";
        }
        if(resultCd.equals("200")){
            log.info("insert Product > " + productMapper.selectProductOne(productDto.getProductCd()));
        }
        return resultCd;
    }
    //상품 업데이트
    public String updateProduct(ProductDto productDto){
        int categoryCount = categoryService.selectCategory(productDto.getCateNm());
        int brandCount = brandService.selectBrand(productDto.getBrandNm()) == null ? 0 : 1;
        String resultCd = "200";
        if(productMapper.selectProductOne(productDto.getProductCd()) != null ){
            if( brandCount == 0 && categoryCount == 0  ){
                //카테고리/브랜드 모두 미존재
                resultCd = "201";
            }else if (categoryCount== 0 ){
                //카테고리 미존재
                resultCd = "202";
            }else if(brandCount  ==0){
                //브랜드 미존재
                resultCd = "203";
            }else {
                //카테고리 브랜드 모두존재
                resultCd = productMapper.updateProduct(productDto) > 0 ? "200" : "999";

            }
        }else{
            resultCd = "204";
        }
        if(resultCd.equals("200")){
            log.info("update Product > " + productMapper.selectProductOne(productDto.getProductCd()));
        }
        return resultCd;
    }
    //상품 삭제
    public String deleteProduct(String productCd){

        return productMapper.deleteProduct(productCd) > 0 ? "200" : "204";
    }
}
