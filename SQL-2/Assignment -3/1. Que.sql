#1. 1.Retrieve the names of all customers and the titles of the films they have rented.
select c.first_name ,f.title
from customer c 
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id=f.film_id
order by title,first_name