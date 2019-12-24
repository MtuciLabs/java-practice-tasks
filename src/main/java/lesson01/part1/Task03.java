package lesson01.part1;

public class Task03 {

    /**
     * Мой юный друг
     * Сейчас 2019 год. Наш университет основан 98 лет назад.
     * Написать программу, выводящую на экран год основания МТУСИ.
     *
     * Требования:
     * 1. Программа должна выводить текст.
     * 2. Выведенный год должен состоять из 4 цифр.
     * 3. Выведенный год должен начинаться с "19".
     * 4. Выведенный год должен соответствовать заданию.
     */

    public static void main(String[] args) {
        int milenium = 2000;
        int year_now = 19;
        int uni_age = 98;

        year_now += milenium;
        int year_of_foundation = year_now - uni_age;

        System.out.print("МТУСИ был основан в ");
        System.out.print(year_of_foundation);
        System.out.print(" году ");
    }
}
