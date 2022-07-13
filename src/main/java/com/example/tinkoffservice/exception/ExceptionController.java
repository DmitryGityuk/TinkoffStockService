package com.example.tinkoffservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionController extends ResponseEntityExceptionHandler {
    @ExceptionHandler({StockNotFoundException.class})
    public ResponseEntity<ErrorDTO> handlerNotFound(Exception ex) {
        return new ResponseEntity<ErrorDTO>(new ErrorDTO(ex.getLocalizedMessage()), HttpStatus.NOT_FOUND);
    }
}
