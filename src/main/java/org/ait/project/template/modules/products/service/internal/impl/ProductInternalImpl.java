package org.ait.project.template.modules.products.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.modules.products.model.entity.Products;
import org.ait.project.template.modules.products.service.delegate.ProductDelegate;
import org.ait.project.template.modules.products.service.internal.ProductInternal;
import org.ait.project.template.modules.products.transform.ProductMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseCollection;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.ait.project.template.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductInternalImpl implements ProductInternal {

    private final ProductMapper productMapper;
    private final ProductDelegate productDelegate;
    private final ResponseHelper responseHelper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> getAllProduct() {
        List<Products> productsList = productDelegate.getAllProduct();
        System.out.println("Kata ntep suruh kasih ini");
        System.out.println(productsList);
        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS,null,
                productMapper.mapProductToResponseList(productsList));
    }
}