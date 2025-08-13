CREATE DATABASE ecommerce;
\c ecommerce;
CREATE TABLE IF NOT EXISTS product (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    price NUMERIC
);
INSERT INTO product (name, price) VALUES
('Laptop', 999.99),
('Phone', 499.99),
('Headphones', 99.99);
