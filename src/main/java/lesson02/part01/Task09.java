package lesson02.part01;

/**
 * Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
 * 1
 * 1+2=3
 * 1+2+3=6
 * ...
 * Пример вывода:
 * 1
 * 3
 * 6
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 5 строк.
 * 3.	Число в каждой новой строке должно быть больше предыдущего.
 * 4.	Выводимый текст должен соответствовать заданию.
 */

public class Task09 {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i;
        int sum;
        sum = 0;
        for(i=1;i!=4;i++) {
            sum = sum + i;
            System.out.println(sum);
        }
    }
}
