package cl.sanosysalvos.auditoria.repository;

import cl.sanosysalvos.auditoria.entity.EventoAuditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoAuditoriaRepository extends JpaRepository<EventoAuditoria, Long> {
}
