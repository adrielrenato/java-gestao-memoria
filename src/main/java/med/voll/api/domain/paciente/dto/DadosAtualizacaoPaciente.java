package med.voll.api.domain.paciente.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.endereco.dto.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotBlank
        String id,

        String nome,
        String telefone,

        @Valid
        DadosEndereco endereco
) {
}
