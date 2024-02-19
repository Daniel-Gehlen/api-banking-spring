package model;

import java.util.Date;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@EntityScan
class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    // Associação com a conta relacionada à transação
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Long id;
    
    // Tipo de transação: Depósito, Saque, Transferência, etc.
    private String type; // Máximo de 50 caracteres
    
    // Data da transação
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    
    // Valor da transação
    private double amount; // Double
    
    // Moeda da transação: BRL, USD, EUR, etc.
    private String currency; // Máximo de 3 caracteres
    
    // Descrição da transação
    private String description; // Máximo de 255 caracteres
    
    // Status da transação: Pendente, Concluída, Cancelada, etc.
    private String status; // Máximo de 50 caracteres
    
    // Recipiente da transação (para transferências, por exemplo)
    private String recipient; // Máximo de 255 caracteres
    
    // Fonte da transação (para transferências, por exemplo)
    private String source; // Máximo de 255 caracteres
    
    // Comerciante associado à transação (para compras, por exemplo)
    private String merchant; // Máximo de 255 caracteres

    public Transaction(String type, Date date, double amount, String currency, String description, String status) {
        this.setType(type);
        this.setDate(date);
        this.setAmount(amount);
        this.setCurrency(currency);
        this.setDescription(description);
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }
}
