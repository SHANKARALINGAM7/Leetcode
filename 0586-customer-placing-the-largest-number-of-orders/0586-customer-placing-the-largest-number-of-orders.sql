# Write your MySQL query statement belo
with cte as(
    select customer_number , count(customer_number) as cnt from Orders group by customer_number order by cnt desc Limit 1 
)
select customer_number from cte ;