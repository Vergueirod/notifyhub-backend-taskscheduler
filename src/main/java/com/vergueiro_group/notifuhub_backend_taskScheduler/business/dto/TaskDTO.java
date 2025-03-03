package com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.enums.StatusNotificationEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaskDTO {

    private String id;
    private String task;
    private String description;
    private LocalDateTime createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss" )
    private LocalDateTime eventData;
    private String userEmail;
    private LocalDateTime updateData;
    private StatusNotificationEnum statusNotificationEnum;
}
