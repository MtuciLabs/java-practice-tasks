package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

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

public class Task07 {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(Integer.parseInt(r.readLine()));
            if (list.get(i) % 3 == 0 && list.get(i) % 2 == 0 && list.get(i) != 0) {
                list3.add(list.get(i));
                list2.add(list.get(i));
            } else if (list.get(i) % 3 == 0 && list.get(i) != 0) {
                list3.add(list.get(i));
            } else if (list.get(i) % 2 == 0 && list.get(i) != 0) {
                list2.add(list.get(i));
            } else {
                list4.add(list.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(list4);
    }

    public static void printList(ArrayList<Integer> list) {
      for (Integer lists : list) {
        System.out.println(lists);
        }
        System.out.println("");
    }
}
