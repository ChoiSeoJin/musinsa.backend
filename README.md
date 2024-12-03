# musinsa.backend 과제전형

DB Schema
카테고리 테이블 : tb_category
브랜드 테이블 : tb_brand
상품 테이블 : tb_product

1번 테스트 URL 
> localhost:8080/api/lowest/category
2번 테스트 URL
> localhost:8080/api/lowest/brand
3번 테스트 URL
> localhost:8080/api/brand/product/price
4번 테스트 URL
> 상품 저장
  post method : localhost:8080/api/product/save
  json {
    "productCd" : "A000000011",
    "productNm" : "A_무탠다드최고",
     "price" : 90000,
    "cateNm" : "상의",
    "brandNm" : "D"
}
> 상품 업데이트
  post method : localhost:8080/api/product/update
  json {
    "productCd" : "A000000011",
    "productNm" : "A_무신사랑해",
     "price" : 80000,
    "cateNm" : "상의",
    "brandNm" : "D"
}
> 상품삭제
  상품 업데이트
  post method : localhost:8080/api/product/update
  json {
    "productCd" : "A000000011"
   
}

> 브랜드 저장
  post method : localhost:8080/api/brand/save
  json {
    "brandCd" : "0000000011",
    "brandNm" : "무진장블프"
}
> 브랜드 업데이트
  post method : localhost:8080/api/brand/update
  json {
   "brandCd" : "0000000011",
    "brandNm" : "무진장블프내년에도"
  }

> 브랜드 삭제
  상품 업데이트
  post method : localhost:8080/api/product/delete
  json {
    "brandCd" : "0000000011"
   
}
