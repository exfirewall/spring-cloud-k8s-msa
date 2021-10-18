package com.jaehoon.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;

@Component
public class H2Runner implements ApplicationRunner {
    @Autowired
    DataSource dataSource;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // 기본 연결정보
        // URL : 계속변경됨
        // username : sa
        // password : "" (빈값)
        Connection connection = dataSource.getConnection();
        System.out.println(connection.getMetaData().getURL());
        System.out.println(connection.getMetaData().getUserName());

        // 기본 JDBC 로 SQL 연결 > 테이블 생성 > SQL 닫기
        Statement statement = connection.createStatement();
        String sql = "CREATE TABLE PRODUCT_TB ( prd_no NUMBER NOT NULL, prd_nm VARCHAR(60), std_cls_no NUMBER NOT NULL, prd_stat VARCHAR(100), sale_unit_cost VARCHAR(100) )";
        statement.execute(sql);
        connection.close();

        // JdbcTemplate 를 쓰면 이거 한줄로 SQL 연결 > 실행 > 닫기 자동으로 된다!
        jdbcTemplate.execute("INSERT INTO PRODUCT_TB (prd_no, prd_nm, std_cls_no, prd_stat, sale_unit_cost) values ('1000000001', '태평양 신발', 50, '배송', 1000)");
        jdbcTemplate.execute("INSERT INTO PRODUCT_TB (prd_no, prd_nm, std_cls_no, prd_stat, sale_unit_cost) values ('1000000002', '지중해 옷', 40, '전시', 2000)");
        jdbcTemplate.execute("INSERT INTO PRODUCT_TB (prd_no, prd_nm, std_cls_no, prd_stat, sale_unit_cost) values ('1000000003', '인도양 바지', 30, '반품', 3000)");

    }
}