/*Task1
Написать команды для заполнения второй таблицы
*/
create table if not exists home_work.receivers(
	num int not null,
	name_receivers varchar(255) not null
  	
	);
    insert into home_work.receivers (
    num,
    name_receivers)
values (
    1,
    'Internet-provaider "Solo"'
   );
   
      insert into home_work.receivers (
    num,
    name_receivers)
values (
    2,
    'Giper "Korona"'
   );
      insert into home_work.receivers (
    num,
    name_receivers)
values (
    3,
    'MTS'
   );
