package org.ait.project.template.modules.products.service.delegate;

import org.ait.project.template.modules.products.model.entity.Products;

import java.util.List;

public interface ProductDelegate {

    List<Products> getAllProduct();
    Products createProduct(Products products);

    List<Products> findByProductName(String productName);

}
