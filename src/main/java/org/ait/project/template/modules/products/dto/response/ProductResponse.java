package org.ait.project.template.modules.products.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("product_name")
    private String productName;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("stock")
    private Integer stock;
    @JsonProperty("created_at")
    private ZonedDateTime createdAt;
    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;
}
