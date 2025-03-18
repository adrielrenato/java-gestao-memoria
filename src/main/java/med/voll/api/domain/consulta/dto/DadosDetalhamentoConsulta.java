package med.voll.api.domain.consulta.dto;

import med.voll.api.domain.consulta.model.Consulta;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(
    String id,
    String idMedico,
    String idPaciente,
    LocalDateTime data
) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
    }
}
