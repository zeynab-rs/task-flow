
package com.taskflow.task_management.repository;

import com.taskflow.task_management.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByOwner_Id(Long ownerId);

    Optional<Project> findByIdAndOwner_Id(Long id, Long ownerId);
}
