package med.voll.api.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosAtualizacaoMedico(
        @NotBlank
        String id,

        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
