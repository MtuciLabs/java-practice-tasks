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
        System.out.println(max+""+mid+""+min);

    }
}
