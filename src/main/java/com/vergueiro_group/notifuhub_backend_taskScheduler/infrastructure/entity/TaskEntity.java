package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.entity;

import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.enums.StatusNotificationEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("task")
public class TaskEntity {

    @Id
    private String id;
    private String task;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime eventData;
    private String userEmail;
    private LocalDateTime updateData;
    private StatusNotificationEnum statusNotificationEnum;
}
