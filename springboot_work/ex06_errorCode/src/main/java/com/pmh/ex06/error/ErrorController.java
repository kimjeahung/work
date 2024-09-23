package com.pmh.ex06.error;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Arrays;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(BizException.class)
    public ResponseEntity<ErrorResponse> mException(BizException e){
        ErrorResponse errorResponse = ErrorResponse.builder()
                .message(e.getErrorCode().getMessage())
                .httpStatus(e.getErrorCode().getHttpStatus())
                .localDateTime(LocalDateTime.now())
                .build();
        return ResponseEntity
                .status(errorResponse.getHttpStatus())
                .body(errorResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> validityException(MethodArgumentNotValidException e){

//        System.out.println(e.getBody());
//        System.out.println(Arrays.toString(e.getDetailMessageArguments()));
//        e.getFieldErrors()
//                .stream()
//                .forEach( fieldError -> System.out.println(fieldError.getDefaultMessage()));

//        Object temp = Arrays.stream(e.getDetailMessageArguments()).reduce("",(o, o2) -> o.toString()+o2.toString());
//        System.out.println(temp);

        ErrorResponse errorResponse = ErrorResponse.builder()
                .httpStatus(HttpStatus.BAD_REQUEST)
                .message( Arrays.toString( e.getDetailMessageArguments() ))
                .localDateTime(LocalDateTime.now())
                .build();

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(errorResponse);
    }

}











