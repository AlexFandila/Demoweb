 insert into empleado (id, nombre, apellidos)
	select 3, 'Lucía', 'Ricarti' from dual where not exists (select 1 from empleado where id = 3);
	
insert into empleado (id, nombre, apellidos) 
	select 4, 'Roberto', 'Sánchez'  from dual where not exists (select 1 from empleado where id = 4);