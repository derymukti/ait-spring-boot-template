package org.ait.project.template.modules.products.model.repository;

import org.ait.project.template.modules.products.model.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {
    List<Products> findByProductNameContaining(String productName);

}
