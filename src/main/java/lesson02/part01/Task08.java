package lesson02.part01;

/**
 * Вывести на экран произведение 10 чисел от 1 до 10. Результат - это 1 число.
 * Подсказка: будет три миллиона с хвостиком.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить целое число на экран.
 * 2.	Метод main должен вызывать функцию System.out.println.
 * 3.	Выведенное число должно быть больше трех миллионов.
 * 4.	Выведенное число должно соответствовать заданию.
 */

public class Task08 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i,fact=1,number=10;
        for(i=1;i<=number;i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
