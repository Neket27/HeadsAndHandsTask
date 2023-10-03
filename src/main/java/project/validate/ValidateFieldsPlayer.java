package project.validate;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import project.model.entity.Monster;
import project.model.entity.Player;

import java.util.Set;

public class ValidateFieldsPlayer implements ValidateFieldsPlayerInterface {
    @Override
    public void validate(Player player) {
        checkFields(player);
    }

    @Override
    public void validate(Monster monster) {
        checkFields(monster);
    }

    private void checkFields(Object player) {
        try {
            ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
            Validator validator = validatorFactory.getValidator();
            Set<ConstraintViolation<Object>> dataValidator = validator.validate(player);

            dataValidator.forEach(e -> {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Исправте значение переменной ");
                stringBuilder.append(e.getPropertyPath());
                stringBuilder.append(", текущее значение: ");
                stringBuilder.append(e.getInvalidValue());
                stringBuilder.append("; Message: ");
                stringBuilder.append(e.getMessage());
                throw new RuntimeException(stringBuilder.toString());

            });
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);

        }
    }
}

