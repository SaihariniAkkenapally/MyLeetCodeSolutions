
select t1.stock_name, t1.s1 - t2.s2 as capital_gain_loss from 
    (select stock_name,sum(price) as s1 from stocks where operation='Sell' group by stock_name) as t1,
    (select stock_name,sum(price) as s2 from stocks where operation='Buy' group by stock_name) as t2 
where t1.stock_name=t2.stock_name;