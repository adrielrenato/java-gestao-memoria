package med.voll.api.domain.consulta.dto;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        String idMedico,

        @NotBlank
        String idPaciente,

        @NotNull
        @Future
        LocalDateTime data
) {
}
