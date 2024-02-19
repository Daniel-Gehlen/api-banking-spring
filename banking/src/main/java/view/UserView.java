package view;

import model.Account;
import model.User;
import java.util.List;

public class UserView {
    // Método para exibir as informações de um único usuário
    public void displayUser(User user) {
        // Aqui você pode implementar a lógica para exibir as informações do usuário na tela,
        // em um console, interface gráfica, ou outro meio de saída.
        System.out.println("User ID: " + user.getId());
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());
        // Exibir as informações das contas do usuário, se necessário
        for (Account account : user.getAccounts()) {
            displayAccount(account);
        }
    }

    // Método para exibir uma lista de usuários
    public void displayUsers(List<User> users) {
        // Aqui você pode iterar sobre a lista de usuários e chamar o método displayUser para cada um.
        for (User user : users) {
            displayUser(user);
        }
    }

    // Método para exibir as informações de uma conta
    private void displayAccount(Account account) {
        System.out.println("Account ID: " + account.getId());
        System.out.println("Type: " + account.getType());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Currency: " + account.getCurrency());
    }
}
