package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.battleground;

class Warrior extends Hero {
    int damage = 50;



    Warrior(String newName) {
        super(newName);
    }



    @Override
    public void attackEnemy(Enemy unit) {
        System.out.println("Warrior " + this.name + " has attacked enemy unit and takes " + damage + " of Health" );
        unit.takeDamage(damage);

    }

    public void setHeath(int health){
        this.health = health;
    }
}
