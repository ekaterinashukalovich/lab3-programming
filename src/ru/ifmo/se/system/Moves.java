package ru.ifmo.se.system;

import ru.ifmo.se.stuff.*;
final class Moves {
    private Moves() {}

    static boolean isBroke(Person a, Person b) {
    Person neznayka;
    Person other;

    if (a.getName().contains("Незнайка")) {
        neznayka = a;
        other = b;
    } else if (b.getName().contains("Незнайка")) {
        neznayka = b;
        other = a;
    } else {
        return false;
    }

    if (neznayka.getLucky() >= other.getLucky()) {
        System.out.println("\nНезнайка не сломал машину.");
        return false;
    } else {
        System.out.println("\nНезнайка опять сломал машину.");
        return true;
    }
}

    static String describeWish(Person p) {
        return "Незнайке хотелось поскорее отправиться в путешествие.";
    }

    static String describeFear(Person p, Fears fear) {
        return(
                "\n" + p.getName() + " " + p.getMemories() +
                ", как он боялся " + fear.getFearing()
        );
    }
}