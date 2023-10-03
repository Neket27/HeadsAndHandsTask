package project.validate;

import project.model.entity.Monster;
import project.model.entity.Player;

public interface ValidateFieldsPlayerInterface {

    void validate(Player player);
    void validate(Monster monster);

}
