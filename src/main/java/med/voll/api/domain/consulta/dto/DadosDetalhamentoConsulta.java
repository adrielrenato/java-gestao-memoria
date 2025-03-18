package med.voll.api.domain.consulta.dto;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(
    String id,
    String idMedico,
    String idPaciente,
    LocalDateTime data
) {
}
