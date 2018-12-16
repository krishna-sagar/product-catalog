package com.nisum.productcatalog.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.nisum.productcatalog.exception.CustomException;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value= {CustomException.class})
	public ResponseEntity handleExcpetion(Exception ex, WebRequest req) {
		
		logger.error("error");
		return handleExceptionInternal(ex, ex.getStackTrace(),  null, HttpStatus.BAD_REQUEST, req);
		
		
	}

}
