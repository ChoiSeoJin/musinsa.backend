package com.choiseojin.backend.product.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDate;

@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
    // 상품코드
    private String productCd;
    // 상품이름
    private String productNm;
    // 카테고리코드
    private String cateCd;
    // 카테고리 이름
    private String cateNm;
    // 브랜드코드
    private String brandCd;
    // 브랜드 이름
    private String brandNm;
    // 상품가격
    private Long price;
    // 삭제코드
    private String delYn;
    // 최종등록일자
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDate insDtm;
    // 최종수정일자
    @JsonFormat(pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDate updDtm;

}
