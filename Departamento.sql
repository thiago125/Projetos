create table departamento(

codigo int not null,
nome varchar(40) not null,
gerente char(7),
inicioGer date,   /*Data de inicio da gerencia*/
localizacao char(7),

constraint pk_Departamento
    primary key(codigo)



);
create table empregado(

matricula char(7) not null,
nome varchar(40)  not null,
cpf char(11) not null,
dpto int,
salario numeric(12,2) not null,
admissao date,  /*Data de Admissao do Empregado*/

constraint pk_Empregado
          primary key (matricula),
constraint fk_Departamento
          foreign key (dpto)
          references Departamento (codigo)

);

drop table departamento; 
