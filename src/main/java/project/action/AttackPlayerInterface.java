package project.action;

import project.model.entity.Monster;
import project.model.entity.Player;

public interface AttackPlayerInterface {

    void attack(Player playerAttack, Monster playerProtection);

    void attack(Monster playerAttack, Player playerProtection);
}
