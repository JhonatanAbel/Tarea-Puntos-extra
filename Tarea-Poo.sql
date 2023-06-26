create database poo;
use poo;

create table estudiantes(
nombres varchar(50),
apellidos varchar(50)
);

insert into estudiantes(nombres, apellidos) values
('Sandra','Garcia'),
('Valentina','Aguirre'),
('Daniela','Lopez'),
('Breiner','Rucabado');
select* from estudiantes;

