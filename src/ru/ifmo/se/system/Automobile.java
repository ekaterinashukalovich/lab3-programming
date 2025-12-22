package ru.ifmo.se.system;

import ru.ifmo.se.stuff.Motor;

public class Automobile {
    private String brand;
    private Motor motor;
    private String isBroken;
    private int places;  

    public Automobile(Motor motor) {
        this.motor = motor;
    }
    
    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String a) {
        this.brand = a;
    }

    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public int getPlaces() {
        return this.places;
    }
    public void setPlaces(int c) {
        this.places = c;
    }

    public String getIsBroken() {
        return this.isBroken;
    }
    public void setIsBroken(String e) {
        this.isBroken = e;
    }

}
