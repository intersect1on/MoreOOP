package characters;

import lombok.Getter;
import lombok.AllArgsConstructor;
import kickstrategy.KickStrategy;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int power;
    @Getter
    private int hp;
    private KickStrategy kickStrategy;

    public void setPower(int power) {
        this.power = Math.max(0, power);
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String describe() {
        return "hp=" + hp + ", power=" + power;
    }
}
