package med.voll.api.domain.consulta.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consulta.enums.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotBlank
        String idConsulta,

        @NotNull
        MotivoCancelamento motivo
) {
}
