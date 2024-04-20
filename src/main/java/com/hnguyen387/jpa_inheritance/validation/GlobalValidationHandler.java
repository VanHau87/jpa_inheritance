package com.hnguyen387.jpa_inheritance.validation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalValidationHandler {
	final List<String> errors = new ArrayList<>();
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<List<String>> handleValidation(MethodArgumentNotValidException ex) {
		List<String> errors = ex.getBindingResult().getFieldErrors()
								.stream()
								.map(FieldError::getDefaultMessage)
								.toList();
		return new ResponseEntity<List<String>>(errors, HttpStatus.EXPECTATION_FAILED);
	}
	/*
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException ex) {
		Throwable rootCause =  ex.getCause();
		if (rootCause instanceof InvalidFormatException) {
			InvalidFormatException exception = (InvalidFormatException) rootCause;
			Class<?> targetType = exception.getTargetType();
			Object[] type = targetType.getEnumConstants();
			Object value = exception.getValue();
			String error = String.format("%s is not a valid type. It's must be %s", 
					value.toString(), 
					Arrays.toString(type));
			//return new ResponseEntity<String>(error, HttpStatus.EXPECTATION_FAILED);
			throw new MethodArgumentNotValidException(null, null)
		}
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}
	*/
}
