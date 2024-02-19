package repository;

import org.springframework.data.repository.CrudRepository;

import model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
