package ru.ifmo.se.system;

import java.util.ArrayList;
import ru.ifmo.se.errors.*;
import ru.ifmo.se.stuff.*;


public class Action {
    private static void driveAutomobile(Automobile car)
        throws BrokenAutomobileException {

    if (car == null) {
        throw new NullPointerException("Автомобиль не существует");
    }

    if (car.getIsBroken() != null && car.getIsBroken().contains("сломана")) {
        throw new BrokenAutomobileException(
                "автомобиль сломан и не может ехать"
        );
    }

    System.out.println("Винтик и Шпунтик едут по улице в новом автомобиле.");
}

    public static void go() {

        Neznayka neznayka = new Neznayka();
        Vintik vintik = new Vintik();
        Shpuntik shpuntik = new Shpuntik();


        ArrayList<Person> people = new ArrayList<>();
        people.add(neznayka);
        people.add(vintik);
        people.add(shpuntik);

        System.out.println("На солнечной улице появились персонажи:");
        for (Person p : people) {
            System.out.println("- " + p.getName());
        }

        neznayka.getWish();
        System.out.println(Moves.describeWish(neznayka));
        neznayka.setMemories("вспоминает");
        System.out.println(Moves.describeFear(neznayka, Fears.FLYING));

        System.out.println(neznayka.getName() + " решил взять автомобиль Винтика и Шпунтика.");
        if (neznayka.getWish() > 10) {
            System.out.println(neznayka.getName() + " взял автомобиль.");
        } else {
            System.out.println(neznayka.getName() + " не захотел брать автомобиль.");
            System.out.println("\nСценарий завершен, потому что Незнайка не взял автомобиль");
            return;
        }
        
        Motor oldMotor = new Motor(60, "газированная вода", false);
        Automobile oldCar = new Automobile(oldMotor);
        oldCar.setBrand("Старый автомобиль");
        oldCar.setPlaces(4);
        oldCar.setIsBroken("сломана");
        System.out.println("- Мотор: " + oldCar.getMotor().description());


        try {
            driveAutomobile(oldCar);
        } catch (BrokenAutomobileException e) {
            System.out.println("Попытка поехать на старом автомобиле не удалась: " + e.getMessage());
        }

        Motor newMotor = new Motor(150, "газированная вода", true);
        Automobile newCar = new Automobile(newMotor);
        newCar.setBrand("Новый автомобиль");
        newCar.setPlaces(4);
        newCar.setIsBroken("исправна");
        System.out.println("Мотор: " + newMotor.description());

        try {if (neznayka.getDriving() < 5 || Moves.isBroke(neznayka, vintik) || Moves.isBroke(neznayka, shpuntik))
             {
                throw new BadDrivingException(neznayka.getName()
                        + " плохо водит и ломает автомобиль." + vintik.getName() + vintik.construct() + shpuntik.getName() + shpuntik.construct());
            }
        } catch (BadDrivingException e) {
            System.out.println(e.getMessage());
        }

        try {
            driveAutomobile(newCar);
        } catch (BrokenAutomobileException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\nСценарий завершён.");
    }
}