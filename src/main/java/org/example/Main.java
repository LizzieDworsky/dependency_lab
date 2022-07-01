package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LaserVision laserVision = new LaserVision();
        ArmCannon armCannon = new ArmCannon();
        EnergyClaw energyClaw = new EnergyClaw();
        Attacker robotOne = new Robot(armCannon, "Iron Giant");
        Attacker wolfOne = new Werewolf("Lupin", 40);
        robotOne.Attack();
        wolfOne.Attack();
    }
}