package lesson02.part01;

import java.util.Scanner;

/**
 * Ввести с клавиатуры имя и вывести надпись:
 * name зарабатывает $5,000. Ха-ха-ха!
 @@ -15,7 +17,10 @@
*/
 public class Task19 {
 public static void main(String[] args) throws Exception {
 //напишите тут ваш код
 Scanner in = new Scanner(System.in);
 String name = in.next();
 System.out.println(name+" зарабатывает $5,000. Ха-ха-ха!");


 }
 }
