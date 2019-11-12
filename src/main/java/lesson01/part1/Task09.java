package lesson01.part1;

public class Task09 {

    /**
     * Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.
     * <p>
     * Пример:
     * Метод sumDigitsInNumber вызывается с параметром 546.
     * <p>
     * Пример вывода:
     * 15
     * <p>
     * <p>
     * Требования:
     * 1. Программа не должна считывать данные с клавиатуры.
     * 2. Метод sumDigitsInNumber(int) должен быть публичным и статическим.
     * 3. Метод sumDigitsInNumber должен возвращать значение типа int.
            * 4. Метод sumDigitsInNumber не должен ничего выводить на экран.
            * 5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
     * 6. Что будет если написать sout и нажать tab?
            */

    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(123));
    }

    public static int sumDigitsInNumber(int number)   {
        int n1, n2, n3;
        n3 = number % 10;
        n2 = (number % 100 - n3) / 10;
        n1 = (number - n3 - n2 ) / 100;
        number = n1 + n2 + n3;
        return number;
    }
}
