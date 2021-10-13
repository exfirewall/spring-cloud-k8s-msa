package com.jaehoon.order.repository;

import com.jaehoon.order.model.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository implements JdbcRepository{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Order> findAll(){
        return jdbcTemplate.query("select * from order_tb", (rs, rownum) -> new Order(
                rs.getString("ord_no"),
                rs.getDate("ord_dts"),
                rs.getInt("mem_no"),
                rs.getString("ord_nm"),
                rs.getInt("prd_no"),
                rs.getInt("prd_qty"),
                rs.getInt("unit_cost")
                )
        );
    }

    @Override
    public Order findById(String id) {
        return jdbcTemplate.queryForObject("select * from order_tb where ord_no = ?", (rs, rownum) -> new Order(
                rs.getString("ord_no"),
                rs.getDate("ord_dts"),
                rs.getInt("mem_no"),
                rs.getString("ord_nm"),
                rs.getInt("prd_no"),
                rs.getInt("prd_qty"),
                rs.getInt("unit_cost")
        ), id);
    }
}
