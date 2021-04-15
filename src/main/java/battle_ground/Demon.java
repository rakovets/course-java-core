package battle_ground;

public class Demon extends Enemy {
    private int DAMAGE_FROM_DEMON = 10;

    public Demon(int health) {
        super(health);
    }

    @Override
    public void atackHero(Hero hero) {
        if (getHealth() < 100) {
            setHealth(DAMAGE_FROM_DEMON * 4);
        } else {
            setHealth(DAMAGE_FROM_DEMON);
        }
    }
}
