public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
// Домашнее задание часть 2
        task4();
        task5();
        task6();
// Домашнее задание часть 3
        task7();
        task8();
        task9();
    }
    public static void task1() {
        int age = 6;
        if (age >= 18) {
            System.out.println("Поздравляю, ты совершеннолетний!");
        }
        if (age < 18) {
            System.out.println("Еще немного потерпи до совершеннолетия!");
        }
    }
    public static void task2() {
        int age = 26;
        if (age < 7) {
            System.out.println("Ребенок дошкольного возраста!");
        }
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }
    }
    public static void task3() {
        int capacityOfOneTrainCar = 102;
        int seatsInOneTrainCar = 60;
        int numberOfPassengersInTheCar = 103;
        if (numberOfPassengersInTheCar < 60) {
            System.out.println("В вагоне есть сидячее и стоячее места");
        }
        if (numberOfPassengersInTheCar >= 60 & numberOfPassengersInTheCar < 102) {
            System.out.println("В вагоне есть только стоячее место");
        }
        if (numberOfPassengersInTheCar >= 102) {
            System.out.println("Мест нет");
        }

    }
    public static void task4() {
        int age = 6;
        if (age >= 18) {
            System.out.println("Поздравляю, ты совершеннолетний!");
        } else {
            System.out.println("Еще немного потерпи до совершеннолетия!");
        }
    }
    public static void task5() {
        int age = 3;
        if (age < 7) {
            System.out.println("Ребенок дошкольного возраста!");
        }
        else if (age >= 7 & age < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        else if (age >= 18 & age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу!");
        }
    }
    public static void task6() {
        int capacityOfOneTrainCar = 102;
        int seatsInOneTrainCar = 60;
        int numberOfPassengersInTheCar = 59;
        if (numberOfPassengersInTheCar < 60) {
            System.out.println("В вагоне есть сидячее и стоячее места");
        }
        else if (numberOfPassengersInTheCar >= 60 & numberOfPassengersInTheCar < 102) {
            System.out.println("В вагоне есть только стоячее место");
        } else {
            System.out.println("Мест нет");
        }

    }
    public static void task7() {
        int age = 8;
        if (age > 1) {
            boolean kindergarten = age >= 2 && age <= 6;
            boolean school = age >= 7 && age <= 18;
            boolean university = age > 18 && age < 24;
            if (kindergarten) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
            }
            else if (school) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            }
            else if (university) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
            }
        } else {
            System.out.println("Условиями задачи не предусмотренно");
        }

    }
    public static void task8() {
        int age = 20;
        if (age < 5) {
            System.out.println("Ребенку кататься нельзя");
        }
        else if (age >= 5 && age <= 14) {
            System.out.println("Ребенок может кататься только с сопровождением взрослого");
        } else {
            System.out.println("Ребенок может кататься без сопровождением взрослого");
        }
    }
    public static void task9() {
        int one = 3;
        int two = 2;
        int free = 1;
        if (one > two && one > free) {
            System.out.println("Наибольшее число " + one);
        }
        else if (two > one && two > free) {
            System.out.println("Наибольшее число " + two);
        }
        else {
            System.out.println("Наибольшее число " + free);
        }

    }


}