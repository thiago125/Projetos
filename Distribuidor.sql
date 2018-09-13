create table cliente(
codigo_cliente int  not null,
primeiro_nome varchar(30) not null,
nome_do_meio  varchar(50) not null,
ultimo_nome varchar(30) not null,
saldo_cliente numeric(9,2),
codigo_area_cliente char(3),
telefone_cliente char(9),

constraint pk_Cliente
   primary key (codigo_cliente)
);

create table fornecedor(
codigo_fornecedor int not null,
nome_fornecedor varchar(50) not null,
telefone_fornecedor char(9) not null,
estado_fornecedor char(2),

 constraint pk_Fornecedor
   primary key (codigo_fornecedor) 
);

create table produto(
codigo_produto varchar(10) not null,
fornecedor int not null,
descricao_produto varchar(50) not null,
data_entrada_produto date,
quantidade_estoque smallint,
quantidade_minima smallint,
preco_unitario numeric(8,2),

  constraint pk_Produto
     primary key (codigo_produto),
  constraint fk_Produto_Fornecedor
      foreign key (fornecedor)
      references Fornecedor(codigo_fornecedor)
);

create table fatura(
numero_fatura numeric not null,
cliente int not null,
data_fatura date, /*Data de vencimento da fatura*/

 constraint pk_Fatura
     primary key (numero_fatura),
  constraint fk_Fatura_Cliente
     foreign key(cliente)
     references Cliente(codigo_cliente)    
);

create table detalhes_fatura(
fatura numeric not null,
produto varchar(10) not null,
quantidade_produto smallint,

constraint fk1_Detalhes_fatura_Fatura
   foreign key (fatura)
   references Fatura (numero_fatura),
constraint fk2_Detalhes_fatura_Produto
   foreign key (produto)
   references Produto (codigo_produto)
 );

/*TABELA CLIENTE*/

alter table cliente alter column ultimo_nome set not null;
alter table cliente alter column primeiro_nome set not null;
alter table cliente alter column saldo_cliente set not null;

/*TABELA FATURA*/

ALTER TABLE fatura alter column cliente set not null;

/*TABELA FORNECEDOR*/

alter table fornecedor alter column nome_fornecedor set not null;
alter table fornecedor alter column telefone_fornecedor set not null;

/*TABELA PRODUTO*/

alter table produto alter column fornecedor set not null;
alter table produto alter column data_entrada_produto set not null;
alter table produto alter column quantidade_estoque set not null;
alter table produto alter column preco_unitario set not null;

/*TABELA DETALHES_FATURA*/

ALTER TABLE detalhes_fatura alter column quantidade_produto set not null;

select current_timestamp;
