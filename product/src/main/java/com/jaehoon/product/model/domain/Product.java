package com.jaehoon.product.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Product implements Serializable {
    private Integer prdNo;
    private String prdNm;
    private Integer stdClsNo;
    private String prdStat;
    private String saleUnitcost;
}
