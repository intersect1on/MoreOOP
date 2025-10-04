package kickstrategy;

import characters.Character;

public class ElfPower implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoKick.getPower() > whoIsKicked.getPower()) {
            whoIsKicked.setHp(0);
        } else {
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}
