#3. List the names of actors who have appeared in the film titled "Chamber Italian".
select first_name,last_name,title from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id=f.film_id
where title="Chamber Italian"