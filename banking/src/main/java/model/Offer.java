package model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@EntityScan
class Offer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // Tipo da oferta: Empréstimo, Investimento, etc.
    private String type; // Máximo de 50 caracteres
    
    // Descrição da oferta
    private String description; // Máximo de 255 caracteres
    
    // Valor da oferta
    private double amount; // Double
    
    // Moeda da oferta: BRL, USD, EUR, etc.
    private String currency; // Máximo de 3 caracteres
    
    // Taxa de juros da oferta
    private double interestRate; // Double
    
    // Termos da oferta
    private String terms; // Máximo de 255 caracteres
    
    // Investimento mínimo necessário
    private double minimumInvestment; // Double
    
    // Retorno potencial do investimento
    private String potentialReturn; // Máximo de 255 caracteres

    public Offer(String type, String description, double amount, String currency) {
        this.setType(type);
        this.setDescription(description);
        this.setAmount(amount);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMinimumInvestment() {
        return minimumInvestment;
    }

    public void setMinimumInvestment(double minimumInvestment) {
        this.minimumInvestment = minimumInvestment;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

    public String getPotentialReturn() {
        return potentialReturn;
    }

    public void setPotentialReturn(String potentialReturn) {
        this.potentialReturn = potentialReturn;
    }
}
