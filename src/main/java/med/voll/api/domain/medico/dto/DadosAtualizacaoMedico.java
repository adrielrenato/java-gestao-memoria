package med.voll.api.domain.medico.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.endereco.dto.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotBlank
        String id,

        String nome,
        String telefone,

        @Valid
        DadosEndereco endereco
) {
}
