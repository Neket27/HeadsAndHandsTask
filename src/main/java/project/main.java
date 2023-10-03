package project;

import project.model.entity.Monster;
import project.model.entity.Player;
import project.service.MonsterService;
import project.service.PlayerService;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        PlayerService playerService = new PlayerService();
        MonsterService monsterService = new MonsterService();

        Player player = playerService.create(7, 2, 20, Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Monster monster = monsterService.create(25, 8, 100, Arrays.asList(1, 2, 3, 4, 5, 6));

        monsterService.attack(monster, player);
        monsterService.attack(monster, player);
        monsterService.attack(monster, player);
        playerService.recovery(player);
        playerService.recovery(player);
        monsterService.attack(monster, player);
        monsterService.attack(monster, player);
        monsterService.attack(monster, player);
        monsterService.attack(monster, player);


        playerService.recovery(player);
        playerService.recovery(player);
        playerService.recovery(player);

        Player p = playerService.create(20, 6, 40, Arrays.asList(6, 2, 3, 8, 5, 9));


    }
}