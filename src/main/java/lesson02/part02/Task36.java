package lesson02.part02;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два числа m и n.
 * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 * Пример: m=2, n=4
 * 8888
 * 8888
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать два числа c клавиатуры.
 * 2.	Программа должна выводить текст на экран.
 * 3.	Программа должна выводить прямоугольник размером m на n из восьмёрок.
 * 4.	В программе должен использоваться цикл for.
 */

public class Task36 {
    public static void main(String[] args) throws Exception {
        Scanner in=new Scanner(System.in);
        int i;
        int j;
        int m=in.nextInt();
        int n=in.nextInt();
        int [][] pr;
        pr=new int[m][n];
        for(i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                pr[i][j]=8;
                System.out.print(pr[i][j]);
            }
            System.out.println();
        }

    }
}
