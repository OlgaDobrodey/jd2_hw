/*task1
Напишите команды для заполнеиня второй таблицы
cсоздание 1 таблицы
*/
create database if not exists Home_Work;
use Home_Work;
create table if not exists home_work.expenses(
	num int not null primary key,
    paydate date,
	receiver int not null,
    cost dec not null
    );

 insert into home_work.expenses (
    num,
    paydate,
    receiver,
    cost)
values (
    1,
    '2011-5-10',
    1,
    20000)
;
 insert into home_work.expenses (
    num,
    paydate,
    receiver,
    cost)
values (
    2,
    '2011-5-10',
    2,
    94200)
;
 insert into home_work.expenses (
    num,
    paydate,
    receiver,
    cost)
values (
    3,
    '2011-5-11',
    3,
    10000)
;
 insert into home_work.expenses (
    num,
    paydate,
    receiver,
    cost)
values (
    4,
    '2011-5-11',
   2,
    12950)
;