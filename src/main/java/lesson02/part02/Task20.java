package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры три числа, и вывести их в порядке убывания. Выведенные числа должны быть разделены пробелом.
 *
 *
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить числа на экран.
 * 3.	Программа должна выводить три числа разделенных пробелами.
 * 4.	Программа должна выводить числа в порядке убывания.
*/

public class Task20 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Integer num1 = Integer.parseInt(reader.readLine());
        Integer num2 = Integer.parseInt(reader.readLine());
        Integer num3 = Integer.parseInt(reader.readLine());
        if (num1 <= num2 && num1 <= num3)
            if (num2 <= num3)
                System.out.println(num3+" "+num2+" "+num1);
            else System.out.println(num2+" "+num3+" "+num1);
        if (num2 <= num1 && num2 <= num3)
            if (num1 <= num3)
                System.out.println(num3+" "+num1+" "+num2);
            else System.out.println(num1+" "+num3+" "+num2);
        if (num3 <= num2 && num3 <= num1)
            if (num2 <= num1)
                System.out.println(num1+" "+num2+" "+num3);
            else System.out.println(num2+" "+num1+" "+num3);
    }
}
