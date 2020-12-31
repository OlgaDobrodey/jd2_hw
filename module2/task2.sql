/*task2
1.запрос из 2 таблиц, где велечина расходов больше 10000
номер/ дата/иимя получателя/ВЕЛИЧИНА
*/
select home_work.expenses.num,
        home_work.expenses.paydate,
        home_work.receivers.name_receivers,
        home_work.expenses.cost 
from home_work.expenses, home_work.receivers 
where  home_work.expenses.receiver = home_work.receivers.num and 
       home_work.expenses.cost>10000;