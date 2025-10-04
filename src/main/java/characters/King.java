package characters;

public class King extends Noble {
    public King() {
        super(5, 5);
    }

    @Override
    public String toString() {
        return "King{" + describe() + "}";
    }
}
