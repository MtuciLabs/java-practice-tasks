package lesson02.part02;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int f = Math.max(Math.max(a, b), c);
        int l = (Math.min(Math.min(a, b), c));
        System.out.print(f);
        if (f>a && l<a){
            System.out.print(a);
        }
        if (f>b && l<b){
            System.out.print(b);
        }
        if (f>c && l<c){
            System.out.print(c);
        }
        System.out.print(l);
    }
}