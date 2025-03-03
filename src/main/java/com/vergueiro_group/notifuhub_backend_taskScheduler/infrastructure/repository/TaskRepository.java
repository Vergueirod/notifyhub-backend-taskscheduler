package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.repository;

import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<TaskEntity, String> {
}
