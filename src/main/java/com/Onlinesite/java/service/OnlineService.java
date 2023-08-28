package com.Onlinesite.java.service;

import com.Onlinesite.java.entity.OnlineEntity;

import java.util.List;

public interface OnlineService {
    OnlineEntity createProduct(OnlineEntity productEntity);
    OnlineEntity getProductById(Long productId);
    List<OnlineEntity> getAllProduct();
    OnlineEntity updateProduct(OnlineEntity product);

    OnlineEntity updateOnline(OnlineEntity onlineEntity);

    void deleteProduct(Long id);
}
