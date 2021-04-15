package battle_ground;

public class Zombie extends Enemy {
    private int DAMAGE_FROM_ZOMBIE = 3;

    public Zombie(int health) {
        super(health);
    }

    @Override
    public void atackHero(Hero hero) {
        setHealth(DAMAGE_FROM_ZOMBIE);
    }

    public int resurrection() {
        if (getHealth() < 20) {
            return getHealth() * 10;
        }
        return getHealth();
    }
}
