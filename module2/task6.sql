/*Task6*/

select * from  home_work.expenses;
/*
1	May 10, 2011, 12:00:00 AM	1	20000
2	May 10, 2011, 12:00:00 AM	2	94200
3	May 11, 2011, 12:00:00 AM	3	10000
4	May 11, 2011, 12:00:00 AM	2	12950
5	May 11, 2011, 12:00:00 AM	1	2000
6	May 10, 2011, 12:00:00 AM	2	94200
7	May 10, 2011, 12:00:00 AM	2	94200
8	May 10, 2011, 12:00:00 AM	3	24200
*/
select * from home_work.receivers
/*
1	Internet-provaider "Solo"
2	Giper "Korona"
3	MTS
1  вывести список получателей и сумму платежей по каждому из них
*/
select home_work.receivers.name_receivers, sum(cost) 
from home_work.receivers,home_work.expenses
where home_work.expenses.receiver = home_work.receivers.num 
group by home_work.receivers.name_receivers;
/*
Giper "Korona"	295550
Internet-provaider "Solo"	22000
MTS	34200

вывести сумму платежей за тот день, когда был наибольший платеж
наибольший платеж был
*/
select num, paydate,cost 
from home_work.expenses 
where cost = (select MAX(cost) from home_work.expenses);
/*
2	2011-05-10	94200
6	2011-05-10	94200
7	2011-05-10	94200
три раза, но в один день


*/
select paydate, sum(cost)
from home_work.expenses 
where  paydate = (select distinct paydate from home_work.expenses where cost = (select MAX(cost) from home_work.expenses))
group by paydate;
/*
2011-05-10	326800
*/
/*Вывести наибольший платяж за тот день когда сумма платежей была наибольшей
выведем суммы по дням 
*/
select paydate, sum(cost)
from  home_work.expenses 
group by paydate;
/*
2011-05-10	326800
2011-05-11	24950
*/
select paydate, raz.maks 
from (
	select paydate, sum(cost) as summ, max(cost) as maks from home_work.expenses group by paydate
) raz 
where raz.summ=(
	select max(summ) from (
		select sum(cost) as summ from home_work.expenses group by paydate
	) maxSum
);

/*
2011-05-10	94200
либо
*/
select raz.maks 
from (
	select paydate, sum(cost) as summ, max(cost) as maks from home_work.expenses group by paydate
) raz 
where raz.summ=(
	select max(summ) from (
		select sum(cost) as summ from home_work.expenses group by paydate
	) maxSum
);
-- 94200

