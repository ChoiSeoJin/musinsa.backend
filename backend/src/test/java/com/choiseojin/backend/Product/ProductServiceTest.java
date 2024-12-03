package com.choiseojin.backend.Product;

import com.choiseojin.backend.brand.service.BrandService;
import com.choiseojin.backend.category.service.CategoryService;
import com.choiseojin.backend.product.dto.ProductDto;
import com.choiseojin.backend.product.service.ProductService;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {
    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    BrandService brandService;

    @Test
    @Transactional
    @DisplayName("최저가 조회 테스트")
    public void selectLowestListTest() {
        Map<String,Object> lowestProductList = productService.lowestProductList();
        String sum = (String)lowestProductList.getOrDefault("총액","0");

        assertThat(sum).isEqualTo("34,100");
        assertThat(lowestProductList.size()).isEqualTo(8);
    }

    @Test
    @Transactional
    @DisplayName("최저가 브랜드 조회 테스트")
    public void selectLowestBrandListTest() {
        Map<String, Object> lowestBrandProductMap = productService.lowestBrandProductList();

        String brand = (String)lowestBrandProductMap.getOrDefault("브랜드", "");
        String price = (String)lowestBrandProductMap.getOrDefault("최저가", "");
        List<Map<String, Object>> categoryList = (List<Map<String, Object>>)lowestBrandProductMap.get("카테고리");

        assertThat(brand).isEqualTo("D"); //최저가 브랜드 검증
        assertThat(price).isEqualTo("36,100"); //상품 총액 검증
        assertThat(categoryList.size()).isEqualTo(8); //카테고리 수 검증
    }

    @Test
    @Transactional
    @DisplayName("최저가/최고가 브랜드 조회 테스트")
    public void selectMinMaxBrandTest() {
        String category = "상의";
        Map<String, Object> brandMinMaxProductMap = productService.brandMinMaxByCate(category);

        Map<String, Object> minProduct = (Map<String, Object>)brandMinMaxProductMap.get("최저가");
        Map<String, Object> maxProduct = (Map<String, Object>)brandMinMaxProductMap.get("최고가");

        String minBrand = (String)minProduct.get("브랜드");
        String minPrice = (String)minProduct.get("가격");
        String maxBrand = (String)minProduct.get("브랜드");
        String maxPrice = (String)maxProduct.get("가격");

        //최저가 브랜드, 가격 검증
        assertThat(minBrand).isEqualTo("C");
        assertThat(minPrice).isEqualTo("10,000");

        //최고가 브랜드, 가격 검증
        assertThat(maxBrand).isEqualTo("I");
        assertThat(maxPrice).isEqualTo("11,400");
    }

    @Test
    @Transactional
    @DisplayName("상품 저장 테스트")
    public void saveProduct() {
        ProductDto testProductDto = ProductDto
                                    .builder()
                                    .productCd("A000000002")
                                    .productNm("A_상의")
                                    .brandNm("A")
                                    .cateNm("상의")
                                    .price(5000L)
                                    .build();
        int categoryCount = categoryService.selectCategory("상의");
        int brandCount = brandService.selectBrand("A") == null  ? 0 : 1;
        ProductDto selectProductDto = productService.selectProductOne(testProductDto.getProductCd());
        String resultCd = productService.saveProduct(testProductDto);
        assertThat(resultCd).isEqualTo("200"); //저장 성공

    }
    @Test
    @Transactional
    @DisplayName("상품 업데이트 테스트")
    public void updateProduct() {
        ProductDto testProductDto = ProductDto
                .builder()
                .productCd("A000000002")
                .productNm("A_상의2")
                .brandNm("A")
                .cateNm("상의")
                .price(1000L)
                .build();

        String resultCd =productService.updateProduct(testProductDto);;
        assertThat(resultCd).isEqualTo("200"); //업데이트 성공
    }
    @Test
    @Transactional
    @DisplayName("상품 업데이트 테스트")
    public void deleteProduct() {

        String resultCd = productService.deleteProduct("A000000001");
        assertThat(resultCd).isEqualTo("200"); //업데이트 성공
    }
}
