package med.voll.api.domain.paciente.repository;

import jakarta.validation.constraints.NotBlank;
import med.voll.api.domain.paciente.model.Paciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente, String> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            SELECT p.ativo FROM Paciente p
            WHERE
            p.id = :id
            """)
    Boolean findAtivoById(String id);
}
