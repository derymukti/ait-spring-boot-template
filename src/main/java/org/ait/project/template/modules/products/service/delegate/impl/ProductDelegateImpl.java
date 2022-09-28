package org.ait.project.template.modules.products.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.products.model.entity.Products;
import org.ait.project.template.modules.products.model.repository.ProductRepository;
import org.ait.project.template.modules.products.service.delegate.ProductDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductDelegateImpl implements ProductDelegate {


    private final ProductRepository productRepository;

    @Override
    public List<Products> getAllProduct(){
        return productRepository.findAll();
    }

    @Override
    public Products createProduct(Products products) {
//        System.out.println(products.getProductName());
        return productRepository.save(products);
    }

    @Override
    public List<Products> findByProductName(String productName) {
        return productRepository.findByProductNameContaining(productName);
    }


}
