package com.jaehoon.order;

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
        String sql = "CREATE TABLE ORDER_TB ( ord_no VARCHAR(60) NOT NULL, ord_dts DATE, mem_no NUMBER NOT NULL, ord_nm VARCHAR(100), prd_no NUMBER NOT NULL, prd_qty NUMBER NOT NULL, unit_cost NUMBER NOT NULL, PRIMARY KEY (ord_no))";
        statement.execute(sql);
        connection.close();

        // JdbcTemplate 를 쓰면 이거 한줄로 SQL 연결 > 실행 > 닫기 자동으로 된다!
        jdbcTemplate.execute("INSERT INTO ORDER_TB (ord_no, ord_dts, mem_no, ord_nm, prd_no, prd_qty, unit_cost) values ('202110120001', '2021-10-12', 123456, '최재훈', 654321, 1, 1000)");
        jdbcTemplate.execute("INSERT INTO ORDER_TB (ord_no, ord_dts, mem_no, ord_nm, prd_no, prd_qty, unit_cost) values ('202110120002', '2021-10-12', 516534, '최', 653241, 2, 2000)");
        jdbcTemplate.execute("INSERT INTO ORDER_TB (ord_no, ord_dts, mem_no, ord_nm, prd_no, prd_qty, unit_cost) values ('202110120003', '2021-10-12', 123141, '최재', 456714, 3, 3000)");

    }
}