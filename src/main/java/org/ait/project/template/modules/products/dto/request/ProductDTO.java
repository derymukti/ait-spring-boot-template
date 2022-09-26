package org.ait.project.template.modules.products.dto.request;

import lombok.Data;

@Data
public class ProductDTO {
    private String productName;
    private Double price;
    private Integer stock;
    private Boolean isActive;
}
