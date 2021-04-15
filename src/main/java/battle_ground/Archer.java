package battle_ground;

public class Archer extends Hero {
    final private int DAMAGE_FROM_ARCHER = 5;

    public Archer(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (this.getHealth() < 50) {
            enemy.takeDamage(DAMAGE_FROM_ARCHER * 4);
        }
        enemy.takeDamage(DAMAGE_FROM_ARCHER);
    }
}
