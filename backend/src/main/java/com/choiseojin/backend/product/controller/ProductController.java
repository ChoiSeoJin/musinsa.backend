package com.choiseojin.backend.product.controller;

import com.choiseojin.backend.common.ResponseDto;
import com.choiseojin.backend.product.dto.ProductDto;
import com.choiseojin.backend.product.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@Slf4j
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/api/lowest/category")
    public ResponseEntity<ResponseDto<Map<String,Object>>>  lowestProductList (){
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,"",productService.lowestProductList())) ;
    }
    @GetMapping("/api/lowest/brand")
    public ResponseEntity<ResponseDto<Map<String,Object>>>  lowestBrandProductList (){
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,"",productService.lowestBrandProductList())) ;
    }
    @GetMapping("/api/brand/product/price")
    public ResponseEntity<ResponseDto<Map<String,Object>>> brandMinMaxByCate (String cate){
        Map<String,Object> resultData = new HashMap<String, Object>();
        log.info(cate);
        if(cate == null){
            resultData.put("error", "파라미터 없습니다.");
        }else{
            resultData = productService.brandMinMaxByCate(cate);
        }

        return !resultData.containsKey("error") ?  ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,"",resultData))
                                                : ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,(String)resultData.getOrDefault("error","알 수 없는 오류가 발생하였습니다.")));
    }

    @PostMapping("/api/product/save")
    public ResponseEntity<ResponseDto<String>> saveProduct(@RequestBody ProductDto productDto){
        String resultCd = productService.saveProduct(productDto);
        String resultMsg = switch (resultCd) {
            case "200" -> "저장 하였습니다.";
            case "201" -> "카테고리/브랜드가 없습니다. ";
            case "202" -> "카테고리가 없습니다. ";
            case "203" -> "브랜드가 없습니다. ";
            case "204" -> "상품코드가 중복입니다. ";
            case "205" -> "상품코드의 길이는 최대 10자입니다. ";
            case "206" -> "상품코드,상품코드,가격은 필수값 입니다.";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
    @PostMapping("/api/product/update")
    public ResponseEntity<ResponseDto<String>> updateProduct(@RequestBody ProductDto productDto){
        String resultCd = productService.updateProduct(productDto);
        String resultMsg = switch (resultCd) {
            case "200" -> "업데이트 하였습니다.";
            case "201" -> "카테고리/브랜드가 없습니다. ";
            case "202" -> "카테고리가 없습니다. ";
            case "203" -> "브랜드가 없습니다. ";
            case "204" -> "상품코드가 없습니다. ";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
    @PostMapping("/api/product/delete")
    public ResponseEntity<ResponseDto<String>>  deleteProduct(@RequestBody ProductDto productDto){
        String resultCd = productService.deleteProduct(productDto.getProductCd());
        String resultMsg = switch (resultCd) {
            case "200" -> "삭제 하였습니다.";
            case "204" -> "상품코드가 없습니다. ";
            default -> "알 수 없는 오류가 발생하였습니다.";
        };
        return ResponseEntity.ok(ResponseDto.res(HttpStatus.OK,resultMsg));
    }
}
