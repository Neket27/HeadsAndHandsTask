package project.action;

import project.model.entity.Monster;
import project.model.entity.Player;

public class RecoveryPlayer implements RecoveryPlayerInterface {

    @Override
    public void recovery(Player player) {
        int countRecovery = player.getCountRecovery();
        int recovery = player.getHealth();
        if (recovery == 100)
            System.out.println("Исцеление не нужно.");
        else {
            if (countRecovery > 0) {
                int heathIncreased = Math.min(player.getHealth() + (int) (recovery * 0.3), 100);
                player.setHealth(heathIncreased);
                player.setCountRecovery(--countRecovery);
                System.out.printf("Произошло исцеление. Здоровье = %d", heathIncreased);
            } else
                System.out.println("Исцеление закончилось.");
        }
    }

    @Override
    public void recovery(Monster monster) {
        int countRecovery = monster.getCountRecovery();
        int recovery = monster.getHealth();
        if (recovery == 100)
            System.out.println("Исцеление не нужно.");
        else {
            if (countRecovery > 0) {
                int heathIncreased = Math.min(monster.getHealth() + (int) (recovery * 0.3), 100);
                monster.setHealth(heathIncreased);
                monster.setCountRecovery(--countRecovery);
                System.out.printf("Произошло исцеление. Здоровье = %d \n ", heathIncreased);
            } else
                System.out.println("Исцеление закончилось.\n ");
        }
    }
}
