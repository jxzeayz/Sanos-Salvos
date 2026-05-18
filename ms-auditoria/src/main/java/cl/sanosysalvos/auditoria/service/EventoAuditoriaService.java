package cl.sanosysalvos.auditoria.service;

import cl.sanosysalvos.auditoria.dto.EventoAuditoriaRequest;
import cl.sanosysalvos.auditoria.entity.EventoAuditoria;
import cl.sanosysalvos.auditoria.exception.EventoAuditoriaNoEncontradoException;
import cl.sanosysalvos.auditoria.repository.EventoAuditoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoAuditoriaService {

    private final EventoAuditoriaRepository eventoAuditoriaRepository;

    public EventoAuditoriaService(EventoAuditoriaRepository eventoAuditoriaRepository) {
        this.eventoAuditoriaRepository = eventoAuditoriaRepository;
    }

    public EventoAuditoria registrarEvento(EventoAuditoriaRequest request) {
        EventoAuditoria evento = new EventoAuditoria(
                request.getTipoEvento(),
                request.getServicioOrigen(),
                request.getDescripcion(),
                request.getReferenciaId(),
                request.getResultado()
        );

        return eventoAuditoriaRepository.save(evento);
    }

    public List<EventoAuditoria> listarEventos() {
        return eventoAuditoriaRepository.findAll();
    }

    public EventoAuditoria buscarEventoPorId(Long id) {
        return eventoAuditoriaRepository.findById(id)
                .orElseThrow(() -> new EventoAuditoriaNoEncontradoException(id));
    }
}