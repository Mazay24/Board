package com.example.board.repository;

import com.example.board.enity.Authorization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizationRepository extends JpaRepository<Authorization, String> {
}
