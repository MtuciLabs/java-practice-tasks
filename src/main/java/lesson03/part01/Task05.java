package lesson03.part01;

import java.util.Scanner;

/**
 * Создать class Person. У человека должно быть имя String name, возраст int age,
 * адрес String address, пол char sex.
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	У класса Person должна быть переменная name с типом String.
 * 3.	У класса Person должна быть переменная age с типом int.
 * 4.	У класса Person должна быть переменная address с типом String.
 * 5.	У класса Person должна быть переменная sex с типом char.
 * 6.	Всего в классе должно быть 4 переменных.
 */

public class Task05 {

    public static void main(String[] args) {
        Person Jonny = new Person();
        System.out.println(Jonny.name + Jonny.age + Jonny.address + Jonny.sex);
    }

    public static class Person {
        private String name;
        private int  age;
        private String address;
        private char sex;

        Person(){
            Scanner in = new Scanner(System.in);
            String name = in.next();
            int age = in.nextInt();
            String address = in.next();
            char sex =in.next().charAt(0);

            this.name = name;
            this.age = age;
            this.address = address;
            this.sex = sex;
        }

    }

}
