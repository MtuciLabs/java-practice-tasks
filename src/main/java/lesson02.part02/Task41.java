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
    public static int main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sr;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(Math.max(Math.max(a,b),c) >a && Math.min(Math.min(a,b),c)<a){
            sr=a;
        }
        if(Math.max(Math.max(a,b),c) >b && Math.min(Math.min(a,b),c)<b){
            sr=b;
        }
        if(Math.max(Math.max(a,b),c) >c && Math.min(Math.min(a,b),c)<c){
            sr=c;
        }
        else{
            sr=a;
        }
        return sr;
    }

}
