package com.choiseojin.backend.brand.service;

import com.choiseojin.backend.brand.repository.BrandMapper;
import com.choiseojin.backend.brand.dto.BrandDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public BrandDto selectBrand(String strBrandNm){
        return brandMapper.selectBrand(strBrandNm);
    }
    //브랜드 저장
    public String savebrand(BrandDto brandDto){
        int  brandCount = brandMapper.selectBrand(brandDto.getBrandNm()) == null ? 0 : 1;
        String resultCd = "200";
        if(brandDto.getBrandNm().length() > 10){
            resultCd = "205";
        }else if(brandCount == 0 ){
                resultCd = brandMapper.saveBrand(brandDto) > 0 ? "200" : "999";
        }else{
            resultCd = "204";
        }
        if(resultCd.equals("200")){
            log.info("insert Product > " + brandMapper.selectBrand(brandDto.getBrandCd()));
        }
        return resultCd;
    }
    //브랜드 업데이트
    public String updateBrand(BrandDto brandDto){
        int  brandCount = brandMapper.selectBrand(brandDto.getBrandNm()) == null ? 0 : 1;
        String resultCd = "200";
        if(brandCount > 0 ){
            resultCd = brandMapper.updateBrand(brandDto) > 0 ? "200" : "999";
        }else{
            resultCd = "204";
        }
        if(resultCd.equals("200")){
            log.info("insert Brand > " + brandMapper.selectBrand(brandDto.getBrandNm()));
        }
        return resultCd;
    }
    //브랜드 삭제
    public Map<String,Object> deleteBrand(String brandCd){

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("productCount",brandMapper.deleteProduct(brandCd));
        resultMap.put("resultCd",brandMapper.deleteBrand(brandCd)  > 0 ? "200" : "204");

        return resultMap;
    }
}
