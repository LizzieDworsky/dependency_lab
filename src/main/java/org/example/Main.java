package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Weapon laserVision = new Weapon("Laser Vision", 50);
        Weapon armCannon = new Weapon("Arm Cannon", 50);
        Weapon energyClaw = new Weapon("Energy Claw", 25);
        Robot robotOne = new Robot(energyClaw);
        System.out.println(robotOne.name);
        robotOne.Attack();

    }
}