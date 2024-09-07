package org.example.inheritance;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy target) {
        System.out.println("Warrior " + getName() + " chops the enemy with battle axe and deals " + getDamage() + " damage.");

        target.takeDamage(getDamage());
    }
}