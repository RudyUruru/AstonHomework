package org.example.inheritance;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero = new Hero("Hasbik");
        Hero target = new Hero("Nefor");
        hero.attackEnemy(target);
    }
}