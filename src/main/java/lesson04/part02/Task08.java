package lesson04.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 1. Создай список из слов "мама", "мыла", "раму".
 * 2. После каждого слова вставь в список строку, содержащую слово "именно".
 * 3. Вывести результат на экран, каждый элемент списка с новой строки.
 * <p>
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Объяви переменную типа список строк и сразу проинициализируй ee.
 * 3.	Добавь в список слова: «мама», «мыла», «раму».
 * 4.	После каждого слова добавь в список строку, содержащую слово «именно».
 * 5.	Выведи элементы списка на экран, каждый с новой строки.
 */

public class Task08 {

  public static void main(String[] args) {
    int i;
    ArrayList<String> a=new ArrayList<>();
    a.add("мама");
    a.add("мыла");
    a.add("раму");
    a.add(1,"именно");
    a.add(3,"именно");
    a.add(5,"именно");
    for (i=0;i<6;i++){
      System.out.println(a.get(i));
    }
  }
}

