import characters.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        String name1 = c1.getClass().getSimpleName() + "(1)";
        String name2 = c2.getClass().getSimpleName() + "(2)";
        System.out.println(name1 + c1.toString() + " vs " + name2 + c2.toString());

        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            System.out.println(name1 + c1.toString() + " kicks " + name2 + c2.toString());

            if (!c2.isAlive()) {
                System.out.println(name1 + " wins!");
                break;
            } else {
                c2.kick(c1);
                System.out.println(name2 + c2.toString() + " kicks " + name1 + c1.toString());
            }
            
            if (!c1.isAlive()) {
                System.out.println(name2 + " wins!");
                break;
            }
        }
    }
}
