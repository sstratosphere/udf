set mapred.reduce.tasks=2;
select count(*) 
from (
select distinct(symbol) from stocks 
) t2
