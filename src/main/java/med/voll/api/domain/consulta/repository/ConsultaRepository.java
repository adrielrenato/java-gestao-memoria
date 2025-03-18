package med.voll.api.domain.consulta.repository;

import med.voll.api.domain.consulta.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, String> {

    Boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(String idMedico, LocalDateTime data);

    Boolean existsByPacienteIdAndDataBetween(String idPaciente, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);
}
