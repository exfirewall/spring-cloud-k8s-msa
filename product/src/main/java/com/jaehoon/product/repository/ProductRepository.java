package com.jaehoon.product.repository;

import com.jaehoon.product.controller.type.RestResponse;
import com.jaehoon.product.model.domain.Product;
import com.jaehoon.product.model.value.ProductRequest;
import com.jaehoon.product.model.value.ProductResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository implements JdbcRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Product findById(Integer id){
        return jdbcTemplate.queryForObject("select * from product_tb where prd_no = ?", (rs, rownum) -> new Product(
                rs.getInt("prd_no"),
                rs.getString("prd_nm"),
                rs.getInt("std_cls_no"),
                rs.getString("prd_stat"),
                rs.getString("sale_unit_cost")
        ), id);
    }

    @Override
    public ProductResponse add(ProductRequest productRequest){
        this.jdbcTemplate.update("INSERT INTO PRODUCT_TB(prd_no, prd_nm, std_cls_no, prd_stat, sale_unit_cost) VALUES (?,?,?,?,?)",
                productRequest.getPrdNo(),
                productRequest.getPrdNm(),
                productRequest.getStdClsNo(),
                productRequest.getPrdStat(),
                productRequest.getUnitCost());
        System.out.println(productRequest);
        Product product = new Product();
        BeanUtils.copyProperties(productRequest, product);
        ProductResponse productResponse = new ProductResponse();
        productResponse.setProduct(product);
        return productResponse;
    }
}
