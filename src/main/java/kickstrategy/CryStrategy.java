package kickstrategy;

import characters.Character;

public class CryStrategy implements KickStrategy {
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        System.out.println("cry");
    }
}
