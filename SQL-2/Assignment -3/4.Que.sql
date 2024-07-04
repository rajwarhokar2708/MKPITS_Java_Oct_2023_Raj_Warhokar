#4. Get the titles of all films rented by the customer named "William Brown".

select title from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where last_name="Brown"