package com.choiseojin.backend.brand.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.time.LocalDate;

@Data
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class BrandDto {
    // 브랜드코드
    private String brandCd;
    // 브랜드 이름
    private String brandNm;
    // 최종등록일자
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDate insDtm;
    // 최종수정일자
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd HH:mm:ss")
    private LocalDate updDtm;

}
