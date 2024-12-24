CREATE TABLE IF NOT EXISTS ORDERS
(
    id           int,
    date         date,
    customer_id  int,
    product_name varchar,
    amount       int,
    PRIMARY KEY (customer_id)
);
insert into public.orders
(id,date,customer_id,product_name, amount)
values
    (1,'2024-12-12',4,'dedal',500),
    (2,'2024-12-24',5,'Varenie',8000),
    (3,'2024-12-12',6,'Makaroshki',300),
    (4,'2024-12-12',2,'AlexeyevskIY',400)
ON CONFLICT (customer_id) DO NOTHING;