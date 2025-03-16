package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoMedico(
        @NotBlank
        String id,

        String nome,
        String telefone,

        @Valid
        DadosEndereco endereco
) {
}
