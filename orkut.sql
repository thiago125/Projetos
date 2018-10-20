create table usuario (
	id_usuario int 		    not null,
	nome_usuario varchar(45)    not null,
	idade_usuario int           not null,
	qtd_amigos_usuario int      not null,
	cidade_usuario varchar(45)  not null,

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

-- ANOTAÇÕES DE AULA 
OBS - Quando o enunciado nao pede as colunas para serem exibidas, eu vou exibir a coluna com chave primária, e um outra coluna com uma descrição referente a coluna pk da tabela. 
OBS - escrevi meu select, tem coluna e função de agregação, 
eu jogo somente os nomes das colunas que escrevi no select no comando group by.

-- QUESTÃO 1 

select u.id_usuario, u.nome_usuario, c.id_comunidade, c.nome_comunidade
from usuario as u, comunidade as c
where c.proprietario_comunidade = u.id_usuario


-- QUESTÃO 2 
select c.id_comunidade, c.nome_comunidade, u.id_usuario, u.nome_usuario
from usuario as u, comunidade as c, orkut as o
where c.id_comunidade = o.id_comunidade_orkut
        and u.id_usuario = o.id_usuario_orkut 


-- QUESTÃO 3 
SELECT u.id_usuario, u.nome_usuario, c.id_comunidade, c.nome_comunidade
from comunidade as c, usuario as u, orkut as o 
where u.id_usuario = c.proprietario_comunidade
           and u.nome_usuario = 'Maria Joaquina Cruz'


--QUESTÃO 4 
SELECT sum (c.qtd_usuarios_comunidade)
FROM usuario as u, comunidade as c
where u.id_usuario = c.proprietario_comunidade
           and u.nome_usuario = 'Maria Joaquina Cruz'


--QUESTÃO 5 
select u.id_usuario, u.nome_usuario, sum(c.qtd_usuarios_comunidade)
from usuario as u, comunidade as c 
where u.id_usuario = c.proprietario_comunidade
group by u.id_usuario, u.nome_usuario


--QUESTÃO 6
select u.id_usuario, u.nome_usuario count(*)
from comunidade as c, usuario as u
where c.proprietario_comunidade = u.id_usuario
group by u.id_usuario, u.nome_usuario

--QUESTÃO 7 
 select u.id_usuario, u.nome_usuario count(*)
 from usuario as u, amigo as a
 where u.id_usuario = a.id_usuario2
 group by u.id_usuario, u.nome_usuario 

 --QUESTÃO 8 
select u.id_usuario, u.nome_usuario max(*)
from usuario as u, comunidade as c
where u.id_usuario = c.proprietario_comunidade
group by u.id_usuario, u.nome_usuario

--QUESTÃO 9 
 select u.id_suario, u.nome_usuario 
 from usuario as u left outer join amigo as a
 on u.idUsuario = a.idUsuario2
 where a.idAmigo is null

           
            



















