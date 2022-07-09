package jav;

public class Main {

    public static void main(String[] args) {
        checkAnimal("рпорп");
        checkState(-5);
        checkToDo(60, false);

    }

    public static void checkAnimal(String name) {
        String animal;
        switch (name) {
            case "Лейка":
            case "Глаша":
            case "Бася":
                animal = "Собака";
                break;
            case "Кокос":
                animal = "Кошка";
                break;
            default:
                animal = "Неизвестное животное";
        }
        System.out.println(animal);
    }

    public static void checkState (int temp) {
        String state;
        if(temp >= 100) {
            state = "gas";
        } else if (temp >= 0) {
            state = "liquid";
        } else {
            state = "solid";
        }
        System.out.println(state);
    }

    public static void checkToDo (int time, boolean weatherIsGood) {
        String activity;
        if (time > 6 && time < 21 && weatherIsGood == true) {
            activity = "Have a walk!";
        }
        else if (time > 6 && time < 21 && weatherIsGood == false) {
            activity = "Read a book!";
        } else {
            activity = "Sleep!";
        }
        System.out.println(activity);
    }
}


