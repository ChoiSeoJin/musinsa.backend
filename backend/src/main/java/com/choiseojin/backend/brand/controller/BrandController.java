package com.choiseojin.backend.brand.controller;

import com.choiseojin.backend.brand.service.BrandService;
import com.choiseojin.backend.brand.dto.BrandDto;
import com.choiseojin.backend.common.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BrandController {
    @Autowired
    private BrandService brandService;

    @PostMapping("/api/brand/save")
    public ResponseEntity<ResponseDto<String>> savebrand(@RequestBody BrandDto brandDto){
        String resultCd = brandService.savebrand(brandDto);
        String resultMsg = switch (resultCd) {
            case "200" -> "저장 하였습니다.";
            case "204" -> "브랜드코드가 중복입니다. ";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
    @PostMapping("/api/brand/update")
    public ResponseEntity<ResponseDto<String>> updatebrand(@RequestBody BrandDto brandDto){
        String resultCd = brandService.updateBrand(brandDto);
        String resultMsg = switch (resultCd) {
            case "200" -> "업데이트 하였습니다.";
            case "204" -> "브랜드코드가 중복입니다. ";
            case "205" -> "브랜드코드의 최대길이는 10자입니다. ";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
    @PostMapping("/api/brand/delete")
    public ResponseEntity<ResponseDto<String>>  deleteBrand(@RequestBody BrandDto brandDto){
        Map<String,Object> resultMap = brandService.deleteBrand(brandDto.getBrandCd());
        String resultCd = (String)resultMap.getOrDefault("resultCd","");
        int productCount = (int)resultMap.getOrDefault("productCount",0);
        String resultMsg = switch(resultCd) {
            case "200" -> "삭제 하였습니다.(상품삭제 " + productCount +" 건)";
            case "204" -> "브랜드코드가 없습니다. ";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
}
