package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon laserVision = new LaserVision();
        Weapon armCannon = new ArmCannon();
        Weapon energyClaw = new EnergyClaw();
        Attacker robotOne = new Robot(armCannon, "Iron Giant");
        Attacker wolfOne = new Werewolf("Lupin", 40);
        robotOne.Attack();
        wolfOne.Attack();
    }
}