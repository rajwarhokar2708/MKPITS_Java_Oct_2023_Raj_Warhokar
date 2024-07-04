#2. 1.Display the rental date and return date for each rental along with the customer's first name and last name.
select rental_date ,return_date,first_name, 
datediff(return_date ,rental_date) as "no. of days"
from customer c 
join rental r on c.customer_id=r.customer_id
