package org.example.inheritance;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy target) {
        target.takeDamage(getDamage());

        System.out.println("Archer " + getName() + " shoots the enemy and deals " + getDamage() + " damage.");
    }
}
