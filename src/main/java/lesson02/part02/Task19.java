package lesson02.part02;

/**
 * Ввести с клавиатуры четыре числа, и вывести максимальное из них. Если числа равны между собой, необходимо вывести любое.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать числа c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Программа должна выводить на экран максимальное из четырёх чисел.
 * 4.	Если максимальных чисел несколько, необходимо вывести любое из них.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Task19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число a");
        System.out.println("Введите число b");
        System.out.println("Введите число c");
        System.out.println("Введите значение h");
        String as = reader.readLine();
        String bs = reader.readLine();
        String cs = reader.readLine();
        String hs=reader.readLine();
        int a = Integer.parseInt(as);
        int b = Integer.parseInt(bs);
        int c = Integer.parseInt(cs);
        int d= Integer.parseInt(hs);
        int l=0;
        int y=0;
        if (a>b){
            l=a;
        }else{
            l=b;

        }if (c>d){
            y=c;

        }else{
            y=d;
        }if (l>y){
            System.out.println(l);

        }else{
            System.out.println(y);
        }if (a==b&&c==d){
            System.out.println(a);
        }  //напишите тут ваш код

    }
}
