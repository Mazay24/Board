package com.example.board.repository;

import com.example.board.enity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByIdTask(Long idTask);
    List<Task> findAllByEnd(Long idProject);
}
