package cl.sanosysalvos.auditoria.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EventoAuditoriaRequest {

    @NotBlank(message = "El tipo de evento es obligatorio")
    @Size(max = 100, message = "El tipo de evento no puede superar los 100 caracteres")
    private String tipoEvento;

    @NotBlank(message = "El servicio de origen es obligatorio")
    @Size(max = 100, message = "El servicio de origen no puede superar los 100 caracteres")
    private String servicioOrigen;

    @NotBlank(message = "La descripción es obligatoria")
    @Size(max = 500, message = "La descripción no puede superar los 500 caracteres")
    private String descripcion;

    @Size(max = 100, message = "La referencia no puede superar los 100 caracteres")
    private String referenciaId;

    @NotBlank(message = "El resultado es obligatorio")
    @Size(max = 50, message = "El resultado no puede superar los 50 caracteres")
    private String resultado;

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getServicioOrigen() {
        return servicioOrigen;
    }

    public void setServicioOrigen(String servicioOrigen) {
        this.servicioOrigen = servicioOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getReferenciaId() {
        return referenciaId;
    }

    public void setReferenciaId(String referenciaId) {
        this.referenciaId = referenciaId;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
