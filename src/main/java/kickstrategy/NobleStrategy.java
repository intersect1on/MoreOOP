package kickstrategy;

import java.util.Random;
import characters.Character;

public class NobleStrategy implements KickStrategy {
    public static Random RANDOM_GENERATOR = new Random();

    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        whoIsKicked.setHp(whoIsKicked.getHp() - RANDOM_GENERATOR.nextInt(whoKick.getPower()));
    }
}
