CREATE TABLE consultas (
    id CHAR(36) DEFAULT (UUID()) PRIMARY KEY,
    medico_id CHAR(36) NOT NULL,
    paciente_id CHAR(36) NOT NULL,
    data DATETIME NOT NULL,
    CONSTRAINT fk_consultas_medico_id FOREIGN KEY (medico_id) REFERENCES medicos(id),
    CONSTRAINT fk_consultas_paciente_id FOREIGN KEY (paciente_id) REFERENCES pacientes(id)
);
