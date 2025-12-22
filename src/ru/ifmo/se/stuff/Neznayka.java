package ru.ifmo.se.stuff;

public class Neznayka extends Person{
    public Neznayka() {
        super.setName(Types.SIMPLE.getType() + " Незнайка");
        super.setMemories("вспоминает");
        super.setLucky(0);
        super.setWish((int) (Math.random() * 10 + 5));
        super.setDriving((int) (Math.random() * 3));
    }
}
