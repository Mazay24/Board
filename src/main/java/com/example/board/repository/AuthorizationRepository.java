package com.example.board.repository;

import com.example.board.enity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationRepository extends JpaRepository<Authentication, Integer> {
    Authentication findByIdUser(Integer idUser);
    boolean existsByLoginAndPassword(String login, String password);
    Authentication findByLogin(String login);
}
