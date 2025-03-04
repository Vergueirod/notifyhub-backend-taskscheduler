package com.vergueiro_group.notifuhub_backend_taskScheduler.business.mapper;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TaskUpdateConverter {

    void updateTask(TaskDTO dto, @MappingTarget TaskEntity entity);
}