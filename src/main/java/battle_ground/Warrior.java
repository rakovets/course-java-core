package battle_ground;

public class Warrior extends Hero {
    final private int DAMAGE_FROM_WARRIOR = 20;
    private int health;

    public Warrior(String name, int health) {
        super(name, health);
        this.health = health;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.health < 100) {
            enemy.takeDamage(DAMAGE_FROM_WARRIOR * 4);
        }
        enemy.takeDamage(DAMAGE_FROM_WARRIOR);
    }
}
