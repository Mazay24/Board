package com.example.board.repository;

import com.example.board.enity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    Board findByIdProject(Integer idProject);
}
