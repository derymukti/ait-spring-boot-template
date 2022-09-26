package org.ait.project.template.modules.products.model.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

//@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String productName;

    private Integer price;

    private Integer stock;

    private Boolean isActive;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
