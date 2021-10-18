package com.jaehoon.product.repository;

import com.jaehoon.product.model.domain.Product;
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
}
