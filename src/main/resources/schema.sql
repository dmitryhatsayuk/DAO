CREATE TABLE ORDERS
(
    id           int,
    date         date,
    customer_id  int,
    product_name varchar,
    amount       int,
    PRIMARY KEY (customer_id)
);