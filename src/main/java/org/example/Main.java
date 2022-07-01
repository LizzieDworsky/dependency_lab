package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LaserVision laserVision = new LaserVision();
        ArmCannon armCannon = new ArmCannon();
        EnergyClaw energyClaw = new EnergyClaw();
        Robot robotOne = new Robot(energyClaw);
        System.out.println(robotOne.name);
        robotOne.Attack();

    }
}