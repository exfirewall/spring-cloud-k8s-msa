package com.jaehoon.order.utils;

import com.jaehoon.order.service.OrderSerivce;

import java.net.URI;
import java.net.URISyntaxException;

public class OrderUtils {
    private OrderUtils() {}

    public static URI getUri(String url){
        URI uri = null;
        try {
            uri = new URI(url);
        } catch (URISyntaxException ex) {
            throw new RuntimeException("URL 반환 오류", ex);
        }
        return uri;
    }
}
