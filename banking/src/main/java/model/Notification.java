package model;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@EntityScan
class Notification {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Tipo da notificação: Alerta, Informativa, etc.
    private String type; // Máximo de 50 caracteres
    
    // Data da notificação
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    // Mensagem da notificação
    private String message; // Máximo de 255 caracteres

    public Notification(String type, Date date, String message) {
        this.setType(type);
        this.setDate(date);
        this.setMessage(message);
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
