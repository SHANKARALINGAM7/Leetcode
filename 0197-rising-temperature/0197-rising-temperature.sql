# Write your MySQL query statement below

select id from Weather as t1 where temperature > 
                    (select temperature from Weather t2 where datediff(t1.recordDate,t2.recordDate) = 1);
