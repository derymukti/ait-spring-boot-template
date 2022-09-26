package org.ait.project.template.modules.products.transform;

import org.ait.project.template.modules.products.dto.request.ProductDTO;
import org.ait.project.template.modules.products.dto.response.ProductResponse;
import org.ait.project.template.modules.products.model.entity.Products;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductResponse mapProductToResponse(Products entity);
    List<ProductResponse> mapProductToResponseList(List<Products> productsList);

    Products mapRequestToProduct(ProductDTO productDTO);



}
