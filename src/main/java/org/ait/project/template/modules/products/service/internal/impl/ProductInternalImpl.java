package org.ait.project.template.modules.products.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.modules.products.model.entity.Products;
import org.ait.project.template.modules.products.service.delegate.ProductDelegate;
import org.ait.project.template.modules.products.service.internal.ProductInternal;
import org.ait.project.template.modules.products.transform.ProductMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseCollection;
import org.ait.project.template.shared.template.ResponseDetail;
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
        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS,null,
                productMapper.mapProductToResponseList(productsList));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ProductResponse>>> createProduct(ProductDTO productDTO) {
        Products products = productDelegate.createProduct(productMapper.mapRequestToProduct(productDTO));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,productMapper.mapProductToResponse(products));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<ProductResponse>>> findByProductName(String productName) {
        List<Products> productsList = productDelegate.findByProductName(productName);
        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null,
                productMapper.mapProductToResponseList(productsList));
    }

}
