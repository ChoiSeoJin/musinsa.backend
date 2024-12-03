-- 테이블 생성 SQL - tb_category
CREATE TABLE tb_category
(
    `cate_cd`  VARCHAR(10)          NOT NULL    COMMENT '카테고리코드',
    `cate_nm`  VARCHAR(50)          NOT NULL    COMMENT '카테고리명',
    `cate_ord` INT                              COMMENT '카테고리순서',
    `ins_dtm`  DATETIME             NOT NULL    COMMENT '최초등록일자',
    `upd_dtm`  DATETIME             NOT NULL    COMMENT '최종등록일자',
     PRIMARY KEY (cate_cd)
);

-- 테이블 생성 SQL - tb_brand
CREATE TABLE tb_brand
(
    `brand_cd`  VARCHAR(10)         NOT NULL    COMMENT '브랜드코드',
    `brand_nm`  VARCHAR(50)         NOT NULL    COMMENT '브랜드이름',
    `ins_dtm`   DATETIME            NOT NULL    COMMENT '최초등록일자',
    `upd_dtm`   DATETIME            NOT NULL    COMMENT '최종등록일자',
     PRIMARY KEY (brand_cd)
);
-- 테이블 생성 SQL - tb_product
CREATE TABLE tb_product
(
    `product_cd`  VARCHAR(10)       NOT NULL    COMMENT '상품코드',
    `product_nm`  VARCHAR(100)      NOT NULL    COMMENT '상품명',
    `cate_cd`     VARCHAR(10)       NOT NULL    COMMENT '카테고리코드',
    `brand_cd`    VARCHAR(10)       NOT NULL    COMMENT '브랜드코드',
    `price`       BIGINT            NOT NULL    COMMENT '가격',
    `ins_dtm`     DATETIME          NOT NULL    COMMENT '최초등록일자',
    `upd_dtm`     DATETIME          NOT NULL    COMMENT '최종등록일자',
     PRIMARY KEY (product_cd),
     FOREIGN KEY (cate_cd) REFERENCES tb_category (cate_cd) ON DELETE RESTRICT ON UPDATE RESTRICT,
     FOREIGN KEY (brand_cd) REFERENCES tb_brand (brand_cd) ON DELETE RESTRICT ON UPDATE RESTRICT
);
