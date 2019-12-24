package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
 * Если все числа равны, вывести любое из них.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить среднее из трех чисел.
 * 4.	Если все числа равны, вывести любое из них.
 * 5.	Если два числа из трех равны, вывести любое из двух.
 */

public class Task41 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());
        Integer num3 = Integer.parseInt(reader.readLine());
        if (num1 >= num2 && num1 <= num3){
            System.out.println(num2);
        }
        else if (num1 >= num3 && num1 <= num2){
            System.out.println(num3);
        }
        else if (num2 >= num1 && num2 <= num3){
            System.out.println(num2);
        }
        else if (num2 >= num3 && num2 <= num1){
            System.out.println(num3);
        }
        else if (num3 >= num2 && num3 <= num1){
            System.out.println(num3);
        }
        else if (num3 >= num1 && num3 <= num2){
            System.out.println(num3);
        }
    }
}
