package lesson02.part02;
import java.io.*;
/**
 * Вводить с клавиатуры числа.
 * Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
 * -1 должно учитываться в сумме.
 * <p>
 * Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
 * while (true) {
 * int number = считываем число;
 * if (проверяем, что number -1)
 * break;
 * }
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
 * 3.	Программа должна посчитать сумму введенных чисел и вывести её на экран.
 * 4.	В программе должен использоваться цикл for, while или do-while.
 */

public class Task42 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number = bufferedReader.readLine();
        int a = Integer.parseInt(number);
        int summ = 0;
        while (a!=-1) {
            summ = summ + a;
            String number1 = bufferedReader.readLine();
            a = Integer.parseInt(number1);
        }
        summ = summ - 1;
        System.out.println(summ);

    }
}
