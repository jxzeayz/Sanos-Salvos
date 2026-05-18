package cl.sanosysalvos.auditoria.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos_auditoria", schema = "auditoria")
public class EventoAuditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_evento", nullable = false, length = 100)
    private String tipoEvento;

    @Column(name = "servicio_origen", nullable = false, length = 100)
    private String servicioOrigen;

    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;

    @Column(name = "referencia_id", length = 100)
    private String referenciaId;

    @Column(name = "resultado", nullable = false, length = 50)
    private String resultado;

    @Column(name = "fecha_evento", nullable = false)
    private LocalDateTime fechaEvento;

    public EventoAuditoria() {
    }

    public EventoAuditoria(String tipoEvento, String servicioOrigen, String descripcion, String referenciaId, String resultado) {
        this.tipoEvento = tipoEvento;
        this.servicioOrigen = servicioOrigen;
        this.descripcion = descripcion;
        this.referenciaId = referenciaId;
        this.resultado = resultado;
    }

    @PrePersist
    public void prePersist() {
        if (this.fechaEvento == null) {
            this.fechaEvento = LocalDateTime.now();
        }
    }

    public Long getId() {
        return id;
    }

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

    public LocalDateTime getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(LocalDateTime fechaEvento) {
        this.fechaEvento = fechaEvento;
    }
}
