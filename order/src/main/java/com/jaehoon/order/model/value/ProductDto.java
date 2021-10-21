package com.jaehoon.order.model.value;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Integer prdNo;
    private String prdNm;
    private Integer stdClsNo;
    private String prdStat;
    private String unitCost;
}
