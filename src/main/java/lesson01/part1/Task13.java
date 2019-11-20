package lesson01.part1;

import java.util.Scanner;

public class Task13 {

    /**
     * что сила тяжести на Луне составляет примерно 17% от силы тяжести на Земле.
     * А теперь этой информацией нужно пользоваться часто, и,
     * чтобы не считать каждый раз, реализуй метод getWeight(int),
     * который принимает вес тела (в Ньютонах) на Земле, и возвращает,
     * сколько это тело будет весить на Луне (в Ньютонах).
     * Тип возвращаемого значения - double.
     * <p>
     * Пример:
     * Метод getWeight вызывается с параметром 888.
     * <p>
     * Пример вывода:
     * 150.96
     * <p>
     * <p>
     * Требования:
     * 1. Метод getWeight(int) должен быть публичным и статическим.
     * 2. Метод getWeight должен возвращать значение типа double.
     * 3. Метод getWeight не должен ничего выводить на экран.
     * 4. Метод getWeight должен правильно переводить вес тела в Ньютонах на Земле в вес этого же тела на Луне, и возвращать это значение.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int erthWeigt = in.nextInt();

        System.out.println(getWeight(erthWeigt));
    }

    public static double getWeight(int earthWeight) {
        earthWeight *= 0.17d;
        return earthWeight;
    }
}
