CREATE SEQUENCE hibernate_sequence INCREMENT BY 1 START WITH 1;

CREATE TABLE products (
  id BIGINT NOT NULL,
   product_name VARCHAR(255) NULL,
   price DOUBLE NULL,
   stock INT NULL,
   is_active BIT(1) NULL,
   updated_at datetime NULL,
   created_at datetime NULL,
   CONSTRAINT pk_products PRIMARY KEY (id)
);