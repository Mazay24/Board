package com.example.board.repository;

import com.example.board.enity.Authentication;
import com.example.board.enity.Release;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RealeaseRepository extends JpaRepository<Release, Integer> {
    Release findByIdTask(Integer idTask);
}
