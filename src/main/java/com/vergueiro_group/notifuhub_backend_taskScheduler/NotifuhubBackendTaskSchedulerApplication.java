package com.vergueiro_group.notifuhub_backend_taskScheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class NotifuhubBackendTaskSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifuhubBackendTaskSchedulerApplication.class, args);
	}

}
