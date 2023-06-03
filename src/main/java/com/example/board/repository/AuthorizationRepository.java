package com.example.board.repository;

import com.example.board.enity.Authentication;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorizationRepository extends JpaRepository<Authentication, String> {
    Authentication findByLogin(String login);
}
