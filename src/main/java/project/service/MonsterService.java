package project.service;

import project.action.AttackPayer;
import project.action.AttackPlayerInterface;
import project.action.RecoveryPlayer;
import project.action.RecoveryPlayerInterface;
import project.model.entity.Monster;
import project.model.entity.Player;
import project.validate.ValidateFieldsPlayer;
import project.validate.ValidateFieldsPlayerInterface;

import java.util.List;

public class MonsterService {

    ValidateFieldsPlayerInterface validateFieldsPlayerInterface;
    RecoveryPlayerInterface recoveryPlayerInterface;
    AttackPlayerInterface attackPlayerInterface;

    public MonsterService() {
        validateFieldsPlayerInterface = new ValidateFieldsPlayer();
        recoveryPlayerInterface = new RecoveryPlayer();
        attackPlayerInterface = new AttackPayer();
    }


    public Monster create(int attack, int protection, int health, List<Integer> damage) throws RuntimeException {
        Monster monster = new Monster(attack, protection, health, damage);
        validateFieldsPlayerInterface.validate(monster);
        System.out.printf("Создан игрок. Здоровье  %d, атака %d, защита %d, диапазон урона: %s \n", health, attack, protection, damage.toString());
        return monster;
    }


    public void attack(Monster playerAttack, Player playerProtection) {
        attackPlayerInterface.attack(playerAttack, playerProtection);
    }

    public void recovery(Monster monster) {
        recoveryPlayerInterface.recovery(monster);
    }
}
