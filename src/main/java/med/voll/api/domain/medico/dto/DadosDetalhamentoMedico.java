package med.voll.api.domain.medico.dto;

import med.voll.api.domain.medico.enums.Especialidade;
import med.voll.api.domain.endereco.model.Endereco;
import med.voll.api.domain.medico.model.Medico;

public record DadosDetalhamentoMedico(
        String id,
        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade,
        Endereco endereco
) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade(), medico.getEndereco());
    }
}
