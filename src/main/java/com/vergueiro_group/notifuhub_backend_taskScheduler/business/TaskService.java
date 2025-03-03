package com.vergueiro_group.notifuhub_backend_taskScheduler.business;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.business.mapper.TaskConverter;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity.TaskEntity;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.enums.StatusNotificationEnum;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.repository.TaskRepository;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final TaskConverter taskConverter;
    private final JwtUtil jwtUtil;

    public TaskDTO saveTask(String token, TaskDTO dto){

        String email = jwtUtil.extractEmailToken(token.substring(7));

        dto.setCreatedAt(LocalDateTime.now());
        dto.setStatusNotificationEnum(StatusNotificationEnum.PENDING);
        dto.setUserEmail(email);
        TaskEntity entity = taskConverter.toTaskEntity(dto);

        return taskConverter.toTaskDTO(
                taskRepository.save(entity));
    }
}
