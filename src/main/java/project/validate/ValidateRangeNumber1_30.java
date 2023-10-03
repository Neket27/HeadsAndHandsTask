package project.validate;

//public class ValidateRangeNumber {
//}

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import project.validate.ValidateRangeNumber;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy= ValidateRangeNumber.class)

public @interface ValidateRangeNumber1_30 {
    String message() default "Значение атаки и защиты должно находится в диапазоне: [от 1 до 30] ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}