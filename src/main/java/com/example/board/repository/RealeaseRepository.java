package com.example.board.repository;

import com.example.board.enity.Realease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealeaseRepository extends JpaRepository<Realease, String> {
    Realease findByTaskName(String name);

}
