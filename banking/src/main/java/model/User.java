package model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;

@EntityScan
public class User {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Alterei o tipo para Long, mais comum para IDs de banco de dados
    
    // Anotação para indicar que o usuário tem uma lista de contas
    @OneToMany(mappedBy = "user")
    private List<Account> accounts;
    
    // Máximo de 255 caracteres para nome e e-mail
    private String name; 
    private String email;

    public User(String name, String email) {
        this.setName(name);
        this.setEmail(email);
        this.accounts = new ArrayList<>();
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
}
