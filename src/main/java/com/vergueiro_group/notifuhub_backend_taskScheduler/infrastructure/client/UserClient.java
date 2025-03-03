package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.client;

import com.vergueiro_group.notifuhub_backend_taskScheduler.business.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user", url = "${user.url}")
public interface UserClient {

    @GetMapping("/user")
    UserDTO searchUserForEmail(@RequestParam("email") String email,
                               @RequestHeader("Authorization") String token);

}
