create table usuario (
	id_usuario int 		    not null,
	nome_usuario varchar(45)    not null,
	idade_usuario int,
	qtd_amigos_usuario int,

	constraint pk_usuario
	     primary key (id_usuario)
);


create table comunidade (
	id_comunidade int            not null,
	proprietario_comunidade int  not null, 
	nome_comunidade varchar(45)  not null,
	qtd_usuarios_comunidade int,

	constraint pk_comunidade 
              primary key (id_comunidade),
	constraint fk_comunidade_usuario
	      foreign key (proprietario_comunidade)
	      references usuario (id_usuario)
);

create table amigo(
	id_usuario2 int        not null,
	id_amigo    int        not null,

	constraint fk1_amigo_usuario
        	foreign key (id_usuario2)
	        references usuario (id_usuario),
	constraint fk2_amigo_usuario
	        foreign key (id_amigo)
	        references usuario (id_usuario)

); 

create table orkut(
	id_usuario_orkut     int        not null,
	id_comunidade_orkut int   not null,

        constraint pk_orkut
		primary key (id_usuario_orkut, id_comunidade_orkut),
        
	constraint fk_orkut_usuario
		foreign key (id_usuario_orkut)
		references usuario (id_usuario),
	constraint fk_orkut_comunidade
		foreign key (id_comunidade_orkut)
		references comunidade (id_comunidade)
);


