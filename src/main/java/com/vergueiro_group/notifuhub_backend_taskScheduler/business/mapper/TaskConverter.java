package com.vergueiro_group.notifuhub_backend_taskScheduler.business.mapper;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskConverter {


    TaskEntity toTaskEntity(TaskDTO dto);
    TaskDTO toTaskDTO(TaskEntity entity);

    List<TaskEntity> toListTaskEntity(List<TaskDTO> dtos);
    List<TaskDTO> toListTaskDTO(List<TaskEntity> entities);
}
