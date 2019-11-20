package lesson01.part1;

public class Task10 {

    /**
     * Не думать о секундах…
     * Напиши код, который считает сколько секунд прошло с 15:00, если на часах 15:30. Выведи результат на экран.
     * <p>
     * <p>
     * Требования:
     * 1. Программа должна выводить текст.
     * 2. Выведенный текст должен быть целым положительным числом.
     * 3. Выведенное число должно быть кратно 60.
     * 4. Выводимое число должно соответствовать заданию.
     */

    public static void main(String[] args) {
        int secondsAfter15 = 0;
        int one_minute = 60;
        int minutesAfter15 = 0;

        while (minutesAfter15 < 30){
            secondsAfter15 += one_minute;
            minutesAfter15++;
        }

        System.out.println(secondsAfter15);
    }
}
