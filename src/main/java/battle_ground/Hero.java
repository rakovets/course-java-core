package battle_ground;

public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health){
        this.health = health;
    }
}
