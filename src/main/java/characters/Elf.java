package characters;

import kickstrategy.ElfPower;

public class Elf extends Character {
    public Elf() {
        super(10, 10, new ElfPower());
    }

    @Override
    public String toString() {
        return "Elf{" + describe() + "}";
    }
}
