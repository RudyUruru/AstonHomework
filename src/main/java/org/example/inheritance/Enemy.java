package org.example.inheritance;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        setHealth(health);
    }

    public void takeDamage(int damage) {
        if (isAlive()) {
            setHealth(health - damage);
        } else {
            System.out.println("Enemy is dead.");
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    private void setHealth(int health) {
        this.health = health;
    }
}