package project.action;

import project.model.entity.Monster;
import project.model.entity.Player;

public class AttackPayer implements AttackPlayerInterface {
    @Override
    public void attack(Player playerAttack, Monster playerProtection) {
        int modifierDamage = playerAttack.getAttack() - (playerProtection.getProtection() + 1);
        modifierDamage = modifierDamage < 1 ? 1 : modifierDamage;
        for (int i = 0; i < modifierDamage; i++) {
            if (((int) (Math.random() * 5) + 1) >= 5) {
                int healthProtection =playerProtection.getHealth() - playerAttack.getDamage().get((int) (Math.random() * (playerAttack.getDamage().size())));
                if(healthProtection>0) {
                    playerProtection.setHealth(healthProtection);
                    System.out.printf("Произошла атака. Здоровье атакующего %d,защищающегося %d \n", playerAttack.getHealth(), healthProtection);
                }
                else {
                    playerProtection.setHealth(0);
                    System.out.println("Игрок убит ");
                    System.out.printf("Произошла атака. Здоровье атакующего %d,защищающегося %d \n", playerAttack.getHealth(), 0);
                }
                break;
            }
        }
    }

    @Override
    public void attack(Monster playerAttack, Player playerProtection) {
        int modifierDamage = playerAttack.getAttack() - (playerProtection.getProtection() + 1);
        modifierDamage = modifierDamage < 1 ? 1 : modifierDamage;
        for (int i = 0; i < modifierDamage; i++) {
            if (((int) (Math.random() * 5) + 1) >= 5) {

                int healthProtection = playerProtection.getHealth() - playerAttack.getDamage().get((int) (Math.random() * (playerAttack.getDamage().size())));
                if(healthProtection>0) {
                    playerProtection.setHealth(healthProtection);
                    System.out.printf("Произошла атака. Здоровье атакующего %d,защищающегося %d \n", playerAttack.getHealth(), healthProtection);
                }else{
                    playerProtection.setHealth(0);
                    System.out.printf("Произошла атака. Здоровье атакующего %d,защищающегося %d \n", playerAttack.getHealth(), 0);
                    System.out.println("Игрок убит ");
                }
                break;
            }
        }
    }

}
