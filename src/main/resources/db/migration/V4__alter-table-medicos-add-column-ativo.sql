alter table medicos add ativo tinyint not null;
update medicos set ativo = 1;
ALTER TABLE medicos MODIFY ativo TINYINT NOT NULL;