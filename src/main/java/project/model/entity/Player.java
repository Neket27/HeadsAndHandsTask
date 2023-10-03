package project.model.entity;

import project.model.ParameterEntity;
import java.util.List;

public class Player extends ParameterEntity {

    public Player(int attack, int protection, int health, List<Integer> damage) {
        super(attack, protection, health, damage);
    }
}
