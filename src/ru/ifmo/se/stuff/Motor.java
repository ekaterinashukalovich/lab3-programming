package ru.ifmo.se.stuff;

public record Motor(int power, String fuel, boolean heated) {
    public String description() {
        return "Автомобиль мощностью " + power + ", работает на " + fuel + (heated ? " с подогревом" : "");
    }
}
