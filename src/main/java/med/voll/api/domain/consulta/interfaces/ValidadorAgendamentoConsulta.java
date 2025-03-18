package med.voll.api.domain.consulta.interfaces;

import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoConsulta {
    void validar(DadosAgendamentoConsulta dados);
}
