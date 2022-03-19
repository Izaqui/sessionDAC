create database agenda;

create table pessoas(

id int not null auto_increment ,
nome varchar(40),
cpf varchar(40)primary key,
)
create table dependente(
uuid varchar(40),
nome varchar(40),
dataDeNascimento varchar(10)
)