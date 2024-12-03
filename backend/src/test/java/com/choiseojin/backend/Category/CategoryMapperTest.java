package com.choiseojin.backend.Category;

import com.choiseojin.backend.category.repository.CategoryMapper;
import jakarta.transaction.Transactional;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest {
    @Autowired
    CategoryMapper categoryMapper;

    @Test
    @Transactional
    @DisplayName("카테고리 조회 테스트")
    public void selectCategory() {
        int cateCnt = categoryMapper.selectCategory("상의");
        int cateCnt2 = categoryMapper.selectCategory("향수");
        assertThat(cateCnt).isEqualTo(1);
        assertThat(cateCnt2).isEqualTo(0);
    }

}
