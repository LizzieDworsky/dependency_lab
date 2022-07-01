package org.example;

public class Robot {

//    Instance variables (HAS A)
    public String name;
    public String weaponName;
    public int weaponPower;


//    Constructor
    public Robot() {
        this.name = "Iron Giant";
        this.weaponPower = 50;
        this.weaponName = "Laser Gun";
    }

//    Methods (CAN DO)
    public void Attack(){
        System.out.println(this.name + " attacks with their " + this.weaponName + " for " + this.weaponPower + " damage!");
    }
}
