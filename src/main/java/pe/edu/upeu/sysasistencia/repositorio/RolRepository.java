package pe.edu.upeu.sysasistencia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysasistencia.modelo.Periodo;

public interface RolRepository extends JpaRepository<Periodo, Long> {
}
