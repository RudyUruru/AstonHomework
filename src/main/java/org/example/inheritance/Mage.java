package org.example.inheritance;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy target) {
        System.out.println("Mage " + getName() + " attack enemy with magic and deals " + getDamage() + " damage.");

        target.takeDamage(getDamage());
    }

}