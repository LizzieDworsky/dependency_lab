package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Robot robotOne = new Robot("Laser Gun", 50);
        System.out.println(robotOne.name);
        robotOne.Attack();

    }
}