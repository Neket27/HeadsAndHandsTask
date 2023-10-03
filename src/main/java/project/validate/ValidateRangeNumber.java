package project.validate;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class ValidateRangeNumber implements ConstraintValidator<ValidateRangeNumber1_30, Integer> {

    @Override
    public boolean isValid(Integer val, ConstraintValidatorContext constraintValidatorContext) {
//        if(val < 1 || val > 30)
//            throw new RuntimeException(constraintValidatorContext.getDefaultConstraintMessageTemplate());
        return val > 0 & val < 31;
    }
}



