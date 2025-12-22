package ru.ifmo.se.stuff;

public class Vintik extends Person implements Construit {
    public Vintik() {
        super.setName(Types.PROFESSOR.getType() + " Винтик");
        super.setDriving(35);
    }

    @Override
    public String construct() {
        return " пытается починить машину.";
    }
}
