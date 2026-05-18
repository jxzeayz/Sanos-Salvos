package cl.sanosysalvos.auditoria.repository;

import cl.sanosysalvos.auditoria.entity.EventoAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoAuditoriaRepository extends JpaRepository<EventoAuditoria, Long> {

    List<EventoAuditoria> findByServicioOrigenIgnoreCase(String servicioOrigen);

    List<EventoAuditoria> findByTipoEventoIgnoreCase(String tipoEvento);

    List<EventoAuditoria> findByServicioOrigenIgnoreCaseAndTipoEventoIgnoreCase(String servicioOrigen, String tipoEvento);
}