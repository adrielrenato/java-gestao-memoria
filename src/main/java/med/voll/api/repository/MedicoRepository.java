package med.voll.api.repository;

import med.voll.api.model.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, String> {
    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
