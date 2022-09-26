package org.ait.project.template.modules.products.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    @NotEmpty
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("stock")
    private Integer stock;
    @JsonProperty("is_active")
    private Boolean isActive;
}
