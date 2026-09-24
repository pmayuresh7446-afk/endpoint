package com.example.endpoint.endpoints.Dto;

import java.time.LocalDateTime;

public class ErrorResponse {
    private LocalDateTime localDateTime;
    private String message;
    private int status;

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public ErrorResponse(LocalDateTime localDateTime, String message, int status) {
        this.localDateTime = localDateTime;
        this.message = message;
        this.status = status;
    }
}
