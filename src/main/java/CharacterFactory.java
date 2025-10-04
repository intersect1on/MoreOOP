import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.lang.reflect.Modifier;
import org.reflections.Reflections;
import characters.Character;
import characters.Hobbit;
import characters.Elf;
import characters.King;
import characters.Knight;

public class CharacterFactory {
    public static Random RANDOM_GENERATOR = new Random();

    public static Character createCharacter() {
        Set<Class<? extends Character>> allowed = Set.of(Hobbit.class, Elf.class, King.class, Knight.class);
        List<Class<? extends Character>> candidates = new ArrayList<>();

        try {
            Reflections reflections = new Reflections("characters");
            Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

            for (Class<? extends Character> cls : subTypes) {
                if (!Modifier.isAbstract(cls.getModifiers()) && allowed.contains(cls)) {
                    candidates.add(cls);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        if (candidates.isEmpty()) {
            candidates.addAll(Arrays.asList(Hobbit.class, Elf.class, King.class, Knight.class));
        }

        Class<? extends Character> chosen = candidates.get(RANDOM_GENERATOR.nextInt(candidates.size()));
        try {
            return chosen.getDeclaredConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to create character instance of " + chosen.getName(), e);
        }
    }
}
