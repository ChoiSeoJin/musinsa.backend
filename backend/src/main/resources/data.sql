--카테고리 데이터 생성
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000001', '상의', 1, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000002', '아우터', 2, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000003', '바지', 3, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000004', '스니커즈', 4, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000005', '가방', 5, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000006', '모자', 6, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000007', '양말', 7, NOW(), NOW());
INSERT INTO tb_category (cate_cd, cate_nm, cate_ord, ins_dtm, upd_dtm) VALUES ('0000000008', '악세사리', 8, NOW(), NOW());
--브랜드 데이터 생성
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000001', 'A', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000002', 'B', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000003', 'C', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000004', 'D', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000005', 'E', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000006', 'F', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000007', 'G', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000008', 'H', NOW(), NOW());
INSERT INTO tb_brand (brand_cd, brand_nm, ins_dtm, upd_dtm) VALUES ('0000000009', 'I', NOW(), NOW());
--상품 데이터 생성
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000001', 'A000000001', 'A_상의', 11200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000001', 'A000000002', 'A_아우터', 5500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000001', 'A000000003', 'A_바지',4200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000001', 'A000000004', 'A_스니커즈', 9000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000001', 'A000000005', 'A_가방', 2000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000001', 'A000000006', 'A_모자', 1700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000001', 'A000000007', 'A_양말', 1800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000001', 'A000000008', 'A_악세사리', 2300, NOW(), NOW());

INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000002', 'B000000001', 'B_상의', 10500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000002', 'B000000002', 'B_아우터', 5900, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000002', 'B000000003', 'B_바지', 3800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000002', 'B000000004', 'B_스니커즈', 9100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000002', 'B000000005', 'B_가방', 2100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000002', 'B000000006', 'B_모자', 2000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000002', 'B000000007', 'B_양말', 2000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000002', 'B000000008', 'B_악세사리', 2200, NOW(), NOW());


INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000003', 'C000000001', 'C_상의', 10000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000003', 'C000000002', 'C_아우터', 6200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000003', 'C000000003', 'C_바지', 3300, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000003', 'C000000004', 'C_스니커즈', 9200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000003', 'C000000005', 'C_가방', 2200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000003', 'C000000006', 'C_모자', 1900, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000003', 'C000000007', 'C_양말', 2200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000003', 'C000000008', 'C_악세사리', 2100, NOW(), NOW());

INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000004', 'D000000001', 'D_상의', 10100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000004', 'D000000002', 'D_아우터', 5100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000004', 'D000000003', 'D_바지', 3000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000004', 'D000000004', 'D_스니커즈', 9500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000004', 'D000000005', 'D_가방', 2500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000004', 'D000000006', 'D_모자', 1500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000004', 'D000000007', 'D_양말', 2400, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000004', 'D000000008', 'D_악세사리', 2000, NOW(), NOW());

INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000005', 'E000000001', 'E_상의', 10700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000005', 'E000000002', 'E_아우터', 5000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000005', 'E000000003', 'E_바지', 3800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000005', 'E000000004', 'E_스니커즈', 9900, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000005', 'E000000005', 'E_가방', 2300, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000005', 'E000000006', 'E_모자', 1800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000005', 'E000000007', 'E_양말', 2100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000005', 'E000000008', 'E_악세사리', 2100, NOW(), NOW());


INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000006', 'F000000001', 'F_상의', 11200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000006', 'F000000002', 'F_아우터', 7200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000006', 'F000000003', 'F_바지', 4000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000006', 'F000000004', 'F_스니커즈', 9300, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000006', 'F000000005', 'F_가방', 2100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000006', 'F000000006', 'F_모자', 1600, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000006', 'F000000007', 'F_양말', 2300, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000006', 'F000000008', 'F_악세사리', 1900, NOW(), NOW());


INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000007', 'G000000001', 'G_상의', 10500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000007', 'G000000002', 'G_아우터', 5800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000007', 'G000000003', 'G_바지', 3900, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000007', 'G000000004', 'G_스니커즈', 9000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000007', 'G000000005', 'G_가방', 2200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000007', 'G000000006', 'G_모자', 1700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000007', 'G000000007', 'G_양말', 2100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000007', 'G000000008', 'G_악세사리', 2000, NOW(), NOW());


INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000008', 'H000000001', 'H_상의', 10800, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000008', 'H000000002', 'H_아우터', 6300, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000008', 'H000000003', 'H_바지', 3100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000008', 'H000000004', 'H_스니커즈', 9700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000008', 'H000000005', 'H_가방', 2100, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000008', 'H000000006', 'H_모자', 1600, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000008', 'H000000007', 'H_양말', 2000, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000008', 'H000000008', 'H_악세사리', 2000, NOW(), NOW());


INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000001', '0000000009', 'I000000001', 'I_상의', 11400, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000002', '0000000009', 'I000000002', 'I_아우터', 6700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000003', '0000000009', 'I000000003', 'I_바지', 3200, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000004', '0000000009', 'I000000004', 'I_스니커즈', 9500, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000005', '0000000009', 'I000000005', 'I_가방', 2400, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000006', '0000000009', 'I000000006', 'I_모자', 1700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000007', '0000000009', 'I000000007', 'I_양말', 1700, NOW(), NOW());
INSERT INTO tb_product (cate_cd, brand_cd, product_cd, product_nm, price, ins_dtm, upd_dtm) VALUES ('0000000008', '0000000009', 'I000000008', 'I_악세사리', 2400, NOW(), NOW());


