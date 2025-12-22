package ru.ifmo.se.stuff;

public class Shpuntik extends Person implements Construit {
    public Shpuntik() {
        super.setName(Types.PROFESSOR.getType() + " Шпунтик");
        super.setDriving(30);
    }

    @Override
    public String construct() {
        return " придумал и сконструировал новую машину.";
    }
}
