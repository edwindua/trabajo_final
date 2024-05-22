create database cliente;



use cliente;

create table ingreso(
id_persona int not null auto_increment,
documento int (10)not null, 
nombre varchar(50) not null,
apellidos varchar(50) not null,
placa varchar(6) not null,
horas int (2),
primary key (id_persona)

);
select * from ingreso;

insert into ingreso(documento, nombre, apellidos, placa, horas) values(1076646,'Edwin','Duarte','esa204', 2);

