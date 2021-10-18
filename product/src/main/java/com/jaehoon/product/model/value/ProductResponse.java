package com.jaehoon.product.model.value;

import com.jaehoon.product.model.domain.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ProductResponse implements Serializable {
    Product product;
}
