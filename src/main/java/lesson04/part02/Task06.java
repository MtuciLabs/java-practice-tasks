package lesson04.part02;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка,
 * и выведи оставшиеся элементы в обратном порядке.
 *
 * Требования:
 * 1.	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
 * 2.	Считай 5 строк с клавиатуры и добавь их в список.
 * 3.	Удали третий элемент списка.
 * 4.	Выведи элементы на экран, каждый с новой строки.
 * 5.	Порядок вывода должен быть обратный.
 */

public class Task06 {
  public static void main(String[] args) throws Exception {
    Scanner in=new Scanner(System.in);

    ArrayList<String> ar=new ArrayList<>();
   for(int i=0;i<5;i++){
     ar.add(in.next());
   }
   ar.remove(2);
   for(int i=3;i>=0;i--){
     System.out.println(ar.get(i));
   }
    //напишите тут ваш код
  }
}
