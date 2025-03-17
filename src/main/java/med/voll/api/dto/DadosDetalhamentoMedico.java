package med.voll.api.dto;

import med.voll.api.enums.Especialidade;
import med.voll.api.model.Endereco;
import med.voll.api.model.Medico;

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
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
