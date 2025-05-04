package com.munikiran.task_manager.repository;

import com.munikiran.task_manager.model.Task;
import com.munikiran.task_manager.model.TaskStatus;
import com.munikiran.task_manager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCreatedBy(User user);
    List<Task> findByCreatedByAndStatus(User user, TaskStatus status);
    List<Task> findByDueDateBetween(LocalDateTime start, LocalDateTime end);
}
