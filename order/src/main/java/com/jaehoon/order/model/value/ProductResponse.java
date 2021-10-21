package com.jaehoon.order.model.value;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
public class ProductResponse {
    private ProductDto product;

    @Override
    public String toString(){
        return product.getPrdNm() + " " + product.getPrdStat() + " " + product.getUnitCost() + " " + product.getStdClsNo();
    }
}
