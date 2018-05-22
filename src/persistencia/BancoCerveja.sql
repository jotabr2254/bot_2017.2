create database cervejaria;

use cervejaria;

create table cerveja(
	idcerveja int primary key auto_increment,
	nome varchar(40) not null,
	tipo varchar(40) not null,
	pais varchar(20) not null,
	nota int(20) not null
	


);
