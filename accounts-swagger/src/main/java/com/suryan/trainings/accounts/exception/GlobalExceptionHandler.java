package com.suryan.trainings.accounts.exception;

import com.suryan.trainings.accounts.dto.ErrorResponseDto;
import com.suryan.trainings.accounts.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {


    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalExceptionHandler(Exception ex, WebRequest request) {

        ErrorResponseDto errorResponse = ErrorResponseDto.builder().apiPath(request.getDescription(false))
                .status(HttpStatus.NOT_FOUND)
                .errorMessage(ex.getMessage())
                .timestamp(LocalDateTime.now()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);


    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {

        ErrorResponseDto errorResponse = ErrorResponseDto.builder().apiPath(request.getDescription(false))
                .status(HttpStatus.NOT_FOUND)
                .errorMessage(ex.getMessage())
                .timestamp(LocalDateTime.now()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);


    }

    @ExceptionHandler(CustomerAlreadyExistsException.class)
    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(CustomerAlreadyExistsException ex, WebRequest request) {

        ErrorResponseDto errorResponse = ErrorResponseDto.builder().apiPath(request.getDescription(false))
                .status(HttpStatus.NOT_FOUND)
                .errorMessage(ex.getMessage())
                .timestamp(LocalDateTime.now()).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);


    }



}
