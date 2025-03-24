package med.voll.api.domain.paciente.dto;

import med.voll.api.domain.paciente.model.Paciente;

public class ListagemPacienteDTO {
    private String id;
    private String nome;
    private String email;
    private String cpf;

    public ListagemPacienteDTO(Paciente paciente) {
        this.id = paciente.getId();
        this.nome = paciente.getNome();
        this.email = paciente.getEmail();
        this.cpf = paciente.getCpf();
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
