package org.example.inheritance;

public class Hero {

    private final String name;

    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Hero target) {
        System.out.println(name + " attack " + target.name);
    }

}
