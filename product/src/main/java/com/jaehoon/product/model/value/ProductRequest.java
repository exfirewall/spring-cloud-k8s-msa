package com.jaehoon.product.model.value;

import jdk.nashorn.internal.objects.annotations.Optimistic;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductRequest implements Serializable {
    private Integer prdNo;
    private String prdNm;
    private Integer stdClsNo;
    private String prdStat;
    private String unitCost;

    @Override
    public String toString(){
        return "prdNo : " +  prdNo + "prdNm : " + prdNm;
    }
}
