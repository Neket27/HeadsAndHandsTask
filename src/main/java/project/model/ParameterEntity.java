package project.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;
import project.validate.ValidateRangeNumber1_30;
import java.util.List;

@Setter
@Getter
public class ParameterEntity {

    @ValidateRangeNumber1_30(message = "Значение атаки должно находится в диапазоне: [от 1 до 30]")
    private int attack;
    @ValidateRangeNumber1_30(message = "Значение защиты должно находится в диапазоне: [от 1 до 30]")
    private int protection;
    @Min(0)
    private int health;
    private int countRecovery;
    private List<Integer> damage;


    public ParameterEntity(int attack, int protection, int health, List<Integer> damage) {
        this.attack = attack;
        this.protection = protection;
        this.health = health;
        this.countRecovery = 4;
        this.damage = damage;
    }

}

