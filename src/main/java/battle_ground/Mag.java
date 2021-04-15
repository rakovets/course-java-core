package battle_ground;

public class Mag extends Hero {
    final private int DAMAGE_FROM_MAG = 10;
    private int health;

    public Mag(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(DAMAGE_FROM_MAG);
    }

       public int powerHealth() {
        if (this.health < 50) {
            return this.health * 3;
        } else {
            return this.health;
        }
    }
}
