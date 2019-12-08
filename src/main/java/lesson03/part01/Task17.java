package lesson03.part01;
import java.util.*;
import java.text.*;

/**
 * Вывести на экран текущую дату в аналогичном виде "21 02 2014".
 * <p>
 * Требования:
 * 1.	Дата должна содержать день, месяц и год, разделенные пробелом.
 * 2.	День должен соответствовать текущему.
 * 3.	Месяц должен соответствовать текущему.
 * 4.	Год должен соответствовать текущему.
 * 5.	Вся дата должна быть выведена в одной строке.
 */

public class Task17 {

  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat formatForDate = new SimpleDateFormat("dd.MM.yyyy ");

    System.out.println("Текущая дата " + formatForDate.format(date));
    //напишите тут ваш код
  }
}
