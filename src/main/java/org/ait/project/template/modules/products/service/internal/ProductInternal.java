package org.ait.project.template.modules.products.service.internal;

import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.shared.template.ResponseCollection;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface ProductInternal {
    ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProduct();

    ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> createProduct(ProductDTO productDTO);

}
