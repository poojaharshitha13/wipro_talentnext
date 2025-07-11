package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {
    public String getModelName() {
        return "Honda Activa";
    }

    public String getRegistrationNumber() {
        return "TS11XY5678";
    }

    public String getOwnerName() {
        return "Sravani";
    }

    public int getSpeed() {
        return 55;
    }

    public void cdplayer() {
        System.out.println("CD Player is playing in Honda.");
    }
}
