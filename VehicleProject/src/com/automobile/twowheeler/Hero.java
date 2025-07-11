package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Hero extends Vehicle {
    public String getModelName() {
        return "Hero Splendor Plus";
    }

    public String getRegistrationNumber() {
        return "AP10AA1234";
    }

    public String getOwnerName() {
        return "Rohit";
    }

    public int getSpeed() {
        return 60;
    }

    public void radio() {
        System.out.println("Radio is turned on in Hero.");
    }
}
