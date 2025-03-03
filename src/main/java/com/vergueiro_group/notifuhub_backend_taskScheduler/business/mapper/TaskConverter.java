package com.vergueiro_group.notifuhub_backend_taskScheduler.business.mapper;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskConverter {

    TaskEntity toTaskEntity(TaskDTO dto);

    TaskDTO toTaskDTO(TaskEntity entity);
}
