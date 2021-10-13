package com.jaehoon.order.model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private String ordNo;
    private Date ordDts;
    private Integer memNo;
    private String ordNm;
    private Integer prdNo;
    private Integer prdQty;
    private Integer unitCost;
}
