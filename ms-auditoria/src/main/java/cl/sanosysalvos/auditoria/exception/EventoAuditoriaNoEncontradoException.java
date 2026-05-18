package cl.sanosysalvos.auditoria.exception;

public class EventoAuditoriaNoEncontradoException extends RuntimeException {

    public EventoAuditoriaNoEncontradoException(Long id) {
        super("Evento de auditoria no encontrado con ID: " + id);
    }
}