package lesson02.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
 * Если введенное число равно нулю, необходимо вывести ноль.
 * Вывести результат на экран.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
 * 4.	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
 * 5.	Если введенное число равно нулю, необходимо вывести ноль.
 */

public class Task12 {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int num = Integer.parseInt(num1);
        if (num > 0){
            System.out.println( num*2);
        }
        else if (num < 0){
            System.out.println(num+1);
        }else {
            System.out.println(0);
        }

    }

}