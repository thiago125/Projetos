create table professor(
Cd_prof     int          not null,
Dpto_prof   smallint,   
Pnm_prof    varchar(15),
Mnm_prof    varchar(30),
Unm_prof    varchar(15),
Esp_prof    varchar(20),
Email_prof  varchar(30),

     constraint PK_Professor
         primary key (cd_prof)
);


create table escola(
Cd_escola      smallint  not null,
Diretor_Escola int       not null,
Nm_escola      varchar(50),

     constraint PK_Escola
	primary key (cd_escola),
     constraint FK_Escola_Professor   
      foreign key (Diretor_Escola)
      --references Professor () 
);

create table departamento(
Cd_dpto    smallint  not null,
Cd_escola  smallint  not null,
Coord_dpto int       not null,
Nm_dpto    varchar(40),

    constraint PK_Departamento 
	primary key (Cd_dpto),
    constraint FK_Departamento_	

);

create table curso(
Cd_curso    int         not null,
Cd_dpto     smallint    not null,
Nm_curso    varchar(30),
Desc_curso  varchar(500),
Crdts_curso smallint,

    constraint PK_Curso
	primary key(Cd_curso)
 );

 create turma(
Cd_turma  int   not null,
Cd_prof   int   not null,
Cd_curso  int   not null,
Cd_sala   int   not null,
NmDisc_turma  varchar(50),
Semestre_turma  char(5),


);
