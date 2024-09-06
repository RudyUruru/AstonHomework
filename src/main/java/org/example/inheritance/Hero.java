package org.example.inheritance;

public abstract class Hero {

    private final String name;
    private final int damage;

    public abstract void attackEnemy(Enemy target);

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

}
