package com.example.board.repository;

import com.example.board.enity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    Task findByIdTask(Integer idTask);
}
