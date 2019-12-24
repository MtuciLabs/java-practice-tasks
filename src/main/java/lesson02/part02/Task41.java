package lesson02.part02;

import java.io.*;
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
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();
        String number3 = bufferedReader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        if (((b<a)&(a<c))|((c<a)&(a<b))){
            System.out.println(a);
        }
        else if (((b < c) & (c < a)) | ((a < c) & (c < b))) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
        inputStream = System.in;
        inputStreamReader = new InputStreamReader(inputStream);
        bufferedReader = new BufferedReader(inputStreamReader);
        number1 = bufferedReader.readLine();
        number2 = bufferedReader.readLine();
        number3 = bufferedReader.readLine();
        a = Integer.parseInt(number1);
        b = Integer.parseInt(number2);
        c = Integer.parseInt(number3);
        if (((b<a)&(a<c))|((c<a)&(a<b))){
            System.out.println(a);
        }
        else if (((b < c) & (c < a)) | ((a < c) & (c < b))) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }
}
