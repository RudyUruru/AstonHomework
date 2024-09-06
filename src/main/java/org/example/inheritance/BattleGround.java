package org.example.inheritance;

public class BattleGround {
    public static void main(String[] args) {
        Hero archer = new Archer("Drevolas", 6);
        Hero mage = new Mage("Grindolf", 15);
        Hero warrior = new Warrior("Gnamik", 9);

        Enemy bigBoba = new Enemy(100);

        while(bigBoba.isAlive()) {
            archer.attackEnemy(bigBoba);
            mage.attackEnemy(bigBoba);
            warrior.attackEnemy(bigBoba);
        }
    }
}