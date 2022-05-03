-- Oracle SQl

create database SSYS

create table Funcionario
 ( Fun_Cod integer primary key not null,
    Fun_Nome Varchar(120) not null,
    Fun_Idd Number(3) not null
    Departamento integer unique not null,
    Fun_Salario float, 
   
    FOREIGN KEY (Departamento)
REFERENCES Departamento (Cod_Dep)
);

Create table Departamento (
    Cod_Dep integer unique not null,
    Dep_Nome varchar(50) not null
);
