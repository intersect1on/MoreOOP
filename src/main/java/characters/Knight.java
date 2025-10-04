package characters;

public class Knight extends Noble {
    public Knight() {
        super(2, 2);
    }

    @Override
    public String toString() {
        return "Knight{" + describe() + "}";
    }
}
