package org.ait.project.template.modules.products.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.modules.products.service.delegate.ProductDelegate;
import org.ait.project.template.modules.products.service.delegate.impl.ProductDelegateImpl;
import org.ait.project.template.modules.products.service.internal.ProductInternal;
import org.ait.project.template.shared.template.ResponseCollection;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController implements ProductInternal {

    private final ProductInternal productInternal;


    @Override
    @GetMapping("/product")
    public ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProduct() {
        return productInternal.getAllProduct();
    }

    @Override
    @PostMapping("/product")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> createProduct(@Valid @RequestBody ProductDTO productDTO) {
        return productInternal.createProduct(productDTO);
    }
}
