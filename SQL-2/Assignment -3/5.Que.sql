# 5.Retrieve the film titles rented by the customer with customer_id 100.
select title ,customer_id from film f
join inventory i on f.film_id = i.film_id 
join rental r on r.inventory_id = i.inventory_id
where customer_id=100