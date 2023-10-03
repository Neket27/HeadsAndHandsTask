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

public class PlayerService {

    ValidateFieldsPlayerInterface validateFieldsPlayerInterface;
    RecoveryPlayerInterface recoveryPlayerInterface;
    AttackPlayerInterface attackPlayerInterface;

    public PlayerService() {
        validateFieldsPlayerInterface = new ValidateFieldsPlayer();
        recoveryPlayerInterface =new RecoveryPlayer();
        attackPlayerInterface =new AttackPayer();
    }

    public Player create(int attack, int protection, int health, List<Integer> damage) {
        Player player = new Player(attack, protection, health, damage);
        validateFieldsPlayerInterface.validate(player);
        System.out.printf("Создан игрок. Здоровье  %d, атака %d, защита %d, диапазон урона: %s \n", health, attack, protection, damage.toString());
        return player;
    }

    public void attack(Player playerAttack, Monster playerProtection) {
    attackPlayerInterface.attack(playerAttack,playerProtection);
    }

    public void recovery(Player player){
        recoveryPlayerInterface.recovery(player);
    }

}
