/*task3
Запрос удаляющийвсе платежи по величине меньше 3000
*/
insert into home_work.expenses (
    num,
    paydate,
    receiver,
    cost)
values (
    5,
    '2011-5-11',
    1,
    2000.0)
    /*в базе нет значения, которое  3000*/
  
delete from home_work.expenses
where home_work.expenses.cost<3000; 

/*удалили из базы*/ 
    
