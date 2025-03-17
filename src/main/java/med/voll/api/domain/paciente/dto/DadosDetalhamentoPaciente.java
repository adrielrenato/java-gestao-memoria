package med.voll.api.domain.paciente.dto;

import med.voll.api.domain.endereco.model.Endereco;
import med.voll.api.domain.paciente.model.Paciente;

public record DadosDetalhamentoPaciente(
        String id,
        String nome,
        String email,
        String telefone,
        String cpf,
        Endereco endereco
) {
    public DadosDetalhamentoPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
    }
}
