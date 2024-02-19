package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@EntityScan
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Tipo da conta: Corrente, Poupança, etc.
    private String type; // Máximo de 50 caracteres

    // Saldo da conta
    private double balance; // Double

    // Moeda da conta: BRL, USD, EUR, etc.
    private String currency; // Máximo de 3 caracteres

    // Proprietário da conta
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Account(String type, double balance, String currency) {
        this.setType(type);
        this.setBalance(balance);
        this.setCurrency(currency);
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

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
