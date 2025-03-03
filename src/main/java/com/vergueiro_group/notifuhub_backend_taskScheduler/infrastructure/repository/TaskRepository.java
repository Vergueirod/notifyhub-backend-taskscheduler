package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.repository;

import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<TaskEntity, String> {

    List<TaskEntity> findByEventDataBetween(LocalDateTime startDate, LocalDateTime endDate);

    List<TaskEntity> findByUserEmail(String email);
}