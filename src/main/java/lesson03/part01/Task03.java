package lesson03.part01;

import java.util.Scanner;

/**
 * Пару задач назад студенты создавали класс Cat.
 * Теперь пришла пора реализовать котов во плоти, разумеется по образу и подобию класса Cat,
 * а точнее - основываясь на нём, как на шаблоне. Их - котов - должно быть трое.
 * Наполните этих троих жизнью, то есть, конкретными данными.
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Нужно создать три объекта типа Cat.
 * 3.	Класс Cat нельзя изменять.
 * 4.	Программа не должна выводить данные на экран.
 */

public class Task03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String name = in.next();
        int age = in.nextInt();
        int weight = in.nextInt();
        int strength = in.nextInt();
        Cat barsic = new Cat(name, age, weight, strength);

        String name2 = in.next();
        int age2 = in.nextInt();
        int weight2 = in.nextInt();
        int strength2 = in.nextInt();
        Cat mursic = new Cat(name2, age2, weight2, strength2);

        String name3 = in.next();
        int age3 = in.nextInt();
        int weight3 = in.nextInt();
        int strength3 = in.nextInt();
        Cat rijic = new Cat(name3, age3, weight3, strength3);

    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }

}
