package com.hnguyen387.jpa_inheritance.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target({FIELD})
@Constraint(validatedBy = EnumTypeValidator.class)
public @interface ValidType {
	Class<? extends Enum<?>> enumClass();
	String message() default "must be any of enum {enumClass}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
