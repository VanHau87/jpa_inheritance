package com.hnguyen387.jpa_inheritance.validation;

import java.util.Arrays;
import java.util.List;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class EnumTypeValidator implements ConstraintValidator<ValidType, String> {
	private Class<? extends Enum<?>> className;
	
	@Override
	public void initialize(final ValidType constraintAnnotation) {
		className = constraintAnnotation.enumClass();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		List<String> values = Arrays.asList(className.getEnumConstants()).stream().map(Enum::name).toList();
		boolean valid = values.contains(value);
		if (!valid) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
					.addConstraintViolation();
			
		}
		return valid;
	}
	
	
	
}
