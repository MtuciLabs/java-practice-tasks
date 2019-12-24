package lesson02.part02;

import java.util.Scanner;

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
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max=0,min=0,mid=0;
        if(a>b & a>c){
            max=a;
            if(b>c){
                mid=b;min=c;
            }else{min=b;mid=c;}
        }
        if(b>c & b>a){
            max=b;
            if(a>c){
                mid=a;min=c;
            }else{min=a;mid=c;}
        }
        if(c>a & c>b){
            max=c;
            if(a>b){
                mid=a;min=b;
            }else{min=a;mid=b;}
        }
        if(a==b & b==c){
            mid=b;
        }
        System.out.println(mid);

    }
}
