package model;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@EntityScan
class Bill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Tipo da fatura: Conta de água, Conta de luz, etc.
    private String type; // Máximo de 50 caracteres
    
    // Valor da fatura
    private double amount; // Double
    
    // Moeda da fatura: BRL, USD, EUR, etc.
    private String currency; // Máximo de 3 caracteres
    
    // Data de vencimento da fatura
    @Temporal(TemporalType.DATE)
    private Date dueDate;
    
    // Status da fatura: Pendente, Paga, etc.
    private String status; // Máximo de 50 caracteres

    public Bill(String type, double amount, String currency, Date dueDate, String status) {
        this.setType(type);
        this.setAmount(amount);
        this.setCurrency(currency);
        this.setDueDate(dueDate);
        this.setStatus(status);
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
