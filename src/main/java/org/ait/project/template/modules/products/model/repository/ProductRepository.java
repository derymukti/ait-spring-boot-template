package org.ait.project.template.modules.products.model.repository;

import org.ait.project.template.modules.products.model.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {
}
