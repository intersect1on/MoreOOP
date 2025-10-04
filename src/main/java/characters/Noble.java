package characters;

import java.util.Random;
import kickstrategy.NobleStrategy;

public abstract class Noble extends Character {
    public static Random RANDOM_GENERATOR = new Random();

    public Noble(int min_power, int min_hp) {
        super(RANDOM_GENERATOR.nextInt(11) + min_power, RANDOM_GENERATOR.nextInt(11) + min_hp, new NobleStrategy());
    }
}
