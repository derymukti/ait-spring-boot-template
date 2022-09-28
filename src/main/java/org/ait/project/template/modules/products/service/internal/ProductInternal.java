package org.ait.project.template.modules.products.service.internal;

import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.modules.products.model.entity.Products;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface ProductInternal {
    ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProduct();

    ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> createProduct(ProductDTO productDTO);

    ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> findByProductName(String productName);

    ResponseEntity<ResponseTemplate<ResponseDetail<Optional<Products>>>> getDetail(Long id);
}
