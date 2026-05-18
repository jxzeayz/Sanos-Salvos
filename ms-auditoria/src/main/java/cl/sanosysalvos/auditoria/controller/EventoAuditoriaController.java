package cl.sanosysalvos.auditoria.controller;

import cl.sanosysalvos.auditoria.dto.EventoAuditoriaRequest;
import cl.sanosysalvos.auditoria.entity.EventoAuditoria;
import cl.sanosysalvos.auditoria.service.EventoAuditoriaService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auditoria/eventos")
public class EventoAuditoriaController {

    private final EventoAuditoriaService eventoAuditoriaService;

    public EventoAuditoriaController(EventoAuditoriaService eventoAuditoriaService) {
        this.eventoAuditoriaService = eventoAuditoriaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EventoAuditoria registrarEvento(@Valid @RequestBody EventoAuditoriaRequest request) {
        return eventoAuditoriaService.registrarEvento(request);
    }

    @GetMapping
    public List<EventoAuditoria> listarEventos() {
        return eventoAuditoriaService.listarEventos();
    }
}
