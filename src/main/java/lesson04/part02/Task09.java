package lesson04.part02;

import java.util.ArrayList;

/**
 * 1. Создай список слов, заполни его самостоятельно.
 * 2. Метод fix должен:
 * 2.1. удалять из списка строк все слова, содержащие букву "р"
 * 2.2. удваивать все слова содержащие букву "л".
 * 2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
 * 2.4. с другими словами ничего не делать.
 *
 * Пример:
 * роза
 * лира
 * лоза
 *
 * Выходные данные:
 * лира
 * лоза
 * лоза
 *
 * Требования:
 * 1.	Программа не должна считывать данные с клавиатуры.
 * 2.	Метод fix должен удалять из списка строк все слова, содержащие букву "р".
 * Исключение: слова содержащие и букву "р" и букву "л" - их нужно оставить.
 * 3.	Метод fix должен удваивать слова, содержащие букву "л" (добавлять еще один элемент с этим словом).
 * Исключение: слова содержащие и букву "л" и букву "р" - их не нужно удваивать.
 * 4.	Метод fix не должен ничего делать со словами, содержащими и букву "л" и букву "р".
 * 5.	Метод fix не должен ничего делать со словами, которые не содержат ни букву "л", ни букву "р".
 */

public class Task09 {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("роза");
    strings.add("лоза");
    strings.add("лира");
    strings = fix(strings);

    for (String string : strings) {
      System.out.println(string);
    }
  }

  public static ArrayList<String> fix(ArrayList<String> strings) {
    //напишите тут ваш код
    int i;
    for (i=0; i<= strings.size()-1; i++){
      if ((strings.get(i).contains("р"))&&(!(strings.get(i).contains("л")))){
        strings.remove(i);
      }
      if ((!(strings.get(i).contains("р"))) && (strings.get(i).contains("л"))) {
        String a= strings.get(i)+ strings.get(i);
        strings.set(i,a);
      }
    }
    return strings;
  }
}
