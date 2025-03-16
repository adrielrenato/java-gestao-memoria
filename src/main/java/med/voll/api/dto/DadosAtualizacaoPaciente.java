package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoPaciente(
        @NotBlank
        String id,

        String nome,
        String telefone,

        @Valid
        DadosEndereco endereco
) {
}
