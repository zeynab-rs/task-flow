
package com.taskflow.task_management.repository;

import com.taskflow.task_management.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {

    List<Task> findAllByProject_Id(Long projectId);

    Optional<Task> findByIdAndProject_Id(Long id, Long projectId);
}
