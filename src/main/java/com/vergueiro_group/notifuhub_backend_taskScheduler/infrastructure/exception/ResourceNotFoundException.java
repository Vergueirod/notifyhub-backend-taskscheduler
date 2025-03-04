package com.vergueiro_group.notifuhub_backend_taskScheduler.infrastructure.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }

    public  ResourceNotFoundException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
