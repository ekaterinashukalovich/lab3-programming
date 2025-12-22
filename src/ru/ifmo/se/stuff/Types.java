package ru.ifmo.se.stuff;

public enum Types {
    PROFESSOR ("Профессор"),
    SIMPLE ("Простофиля");
    private final String type;

    Types(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
