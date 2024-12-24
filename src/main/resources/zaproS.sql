SELECT public.orders.product_name
FROM public.orders
         WHERE public.orders.customer_id in (
                       SELECT public.customers.id
                       FROM public.customers
                       WHERE customers.name  ILIKE :name
);