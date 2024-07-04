#7. List all films with a rental rate between 2.99 and 4.99, inclusive:
select title,rental_rate from film where rental_rate>=2.99 and rental_rate<=4.99 order by rental_rate