package med.voll.api.testes.memoria;

import med.voll.api.domain.paciente.model.Paciente;

public class Principal {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.consultas();
    }
}
