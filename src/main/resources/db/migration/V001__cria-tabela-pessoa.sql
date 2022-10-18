create table pessoa (
	id bigint not null auto_increment,
	nome varchar(60) not null,
	idade tinyint not null,
	email varchar(255) not null, 
	telefone varchar(20) not null,

	primary key (id)
);