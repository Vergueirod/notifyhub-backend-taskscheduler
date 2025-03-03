package com.vergueiro_group.notifuhub_backend_taskScheduler.controller;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.TaskService;
import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.TaskDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
