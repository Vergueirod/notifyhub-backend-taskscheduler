package com.vergueiro_group.notifuhub_backend_taskScheduler.controller;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.TaskService;
import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.enums.StatusNotificationEnum;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskDTO> saveTask(@RequestBody TaskDTO dto,
                                            @RequestHeader("Authorization") String token){

        return ResponseEntity.ok(taskService.saveTask(token, dto));

    }

    @GetMapping("/events")
    public ResponseEntity<List<TaskDTO>> searchScheduledTasksByPeriod(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate){

            return ResponseEntity.ok(taskService.searchScheduledTasksByPeriod(startDate, endDate));
    }

    @GetMapping
    public ResponseEntity<List<TaskDTO>> findByEmailUser(
            @RequestHeader("Authorization") String token){
            return ResponseEntity.ok(taskService.findByUserEmail(token));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteTaskById(
            @RequestParam("id") String id) {
        taskService.deleteTaskById(id);

        return ResponseEntity.ok().build();
    }

    @PatchMapping
    public ResponseEntity<TaskDTO> updateStatusNotification(
            @RequestParam("status") StatusNotificationEnum status,
            @RequestParam("id") String id) {
        return ResponseEntity.ok(taskService.updateStatus(status, id));
    }

    @PutMapping
    public ResponseEntity<TaskDTO> updateTask(
            @RequestBody TaskDTO dto,
            @RequestParam("id") String id) {
        return ResponseEntity.ok(taskService.updateTask(dto, id));
    }
}
