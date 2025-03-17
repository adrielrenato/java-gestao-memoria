package med.voll.api.domain.medico.dto;

import med.voll.api.domain.medico.enums.Especialidade;
import med.voll.api.domain.medico.model.Medico;

public record DadosListagemMedico(
        String id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade
) {
    public DadosListagemMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
}
