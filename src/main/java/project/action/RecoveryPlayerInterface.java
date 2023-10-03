package project.action;

import project.model.entity.Monster;
import project.model.entity.Player;

public interface RecoveryPlayerInterface {

    void recovery(Player player);
    void recovery(Monster monster);
}
