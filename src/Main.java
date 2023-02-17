public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int age = 26;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else  {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать ");
        }
    }
    public static void task2 () {
        System.out.println("Задача 2");
        int temperature = 7;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 89;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " то, придеться заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + " то, можно ездить спокойно");
        }
        }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 62;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int ageChild = 14;
        boolean adult = true;
        if (ageChild <= 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься на аттракционе");
        } else {
            if (ageChild >= 14) {
                System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься на аттракционе");
            } else {
                if ((ageChild > 5 && ageChild < 14) && adult) {
                    System.out.println("Если возраст ребенка равен " + ageChild + " то ему можно кататься в сопровождении взрослого");
                } else {
                        System.out.println("Если возраст ребенка равен " + ageChild + " то ему нельзя кататься без сопровождения взрослого");
                    }
                }
            }
        }
    public static void task6 () {
        System.out.println("Задача 6");
        int totalPlacesInTheCarriage = 120;
        int employedPlaces = 62;
        if (employedPlaces >= totalPlacesInTheCarriage) {
            System.out.println("Мест больше нет");
        } else {
            if (employedPlaces < 60) {
                System.out.println("Есть сидячие и стоячие места");
            } else {
                if (employedPlaces >= 60) {
                    System.out.println("Остались только стоячие места");
                }
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 54;
        int two = 286;
        int three = 102;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чисел " + two + " и " + three);
        } else {
            if (two > one && two > three) {
                System.out.println("Число " + two + " больше чисел " + one + " и " + three);
            } else {
                if (three > one && three > two) {
                    System.out.println("Число " + three + " больше чисел " + one + " и " + two);
                }
            }
        }
    }

}