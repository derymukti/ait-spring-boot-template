package org.ait.project.template.modules.products.model.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

//@Data
@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Products{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String productName;
    private Integer price;
    private Integer stock;
    private Boolean isActive;
    private ZonedDateTime updatedAt;
    private ZonedDateTime createdAt;



}
