package project.model.entity;

import project.model.ParameterEntity;

import java.util.List;

public class Monster extends ParameterEntity {
    public Monster(int attack, int protection, int health, List<Integer> damage) {
        super(attack, protection, health, damage);
    }
}
