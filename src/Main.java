public class Main {
    public static void main(String[] args)
    // Задача 1 совершеннолетие
    {
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Если возраст равен " + age1 + ", человек совершеннолетний");
        }
        int age2 = 17;
        if (age2 <= 18) {
            System.out.println("Если возраст равен " + age2 + " человек не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2 погода
        int temp1 = 3;
        if (temp1 < 5) {
            System.out.println("На улице " + temp1 + " градуса,нужно надеть шапку");
        }
        int temp2 = 10;
        if (temp2 > 5) {
            System.out.println("На улице " + temp2 + " градусов,можно идти без шапки");

        }


        // Задача 3 Штраф за превышение скорости
        int v1 = 90;
        if (v1 > 60) {
            System.out.println("Если скорость " + v1 + " придется заплатить штраф");
        }
        int v2 = 40;
        if (v2 < 60) {
            System.out.println("Если скорость " + v2 + " можно ездить спокойно");
        }
        //Задача 4 Возраст
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Ваш возраст " + age + ", нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Ваш возраст " + age + ", нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Ваш возраст " + age + ", нужно ходить в универ");
        } else if (age > 24) {
            System.out.println("Ваш возраст " + age + ", нужно ходить на работу");
        } else {
            System.out.println("Введены некорректные данные");
        }
        //Задача 5 Ограничения на аттракционах
        int year = 10;
        if (year < 5) {
            System.out.println("Если возраст ребенка равен" + year + "то он не может кататься на аттракционе");
        } else if (year >= 5 && year <= 14) {
            System.out.println("Если возраст ребенка равен " + year + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else if (year > 14) {
            System.out.println("Если возраст ребенка равен " + year + ",то он может кататься без сопровождения взрослого.");
        } else {
            System.out.println("Введены некорректные данные");

        }
        //Задача 6 Вместимость вагона
        int carCapaCity = 72;
        int seating = 50;
        int standing = 42;
        if (seating < 60 && carCapaCity < 102) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seating == 60 && carCapaCity < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (standing == 42 && seating == 60) {
            System.out.println("Вагон переполнен");
        } else {
            System.out.println("В вагоне есть места");
        }
        //Задача 7 Большее из трех чисел
        int one=1;
        int two=5;
        int three=3;
        if (one>two && one>three) {
            System.out.println("Наибольшее из трех чисел ONE");
        }
        else if (two>one && two>three) {
            System.out.println("Наибольшее из трех чисел TWO");
        }
        else {
            System.out.println("Наибольшее из трех чисел THREE");
        }


    }

    }






