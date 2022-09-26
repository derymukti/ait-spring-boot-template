package org.ait.project.template.modules.products.service.delegate;

import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.model.entity.Products;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductDelegate {

    List<Products> getAllProduct();
    Products createProduct(Products products);

}
