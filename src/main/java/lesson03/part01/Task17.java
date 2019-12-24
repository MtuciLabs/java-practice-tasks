package lesson03.part01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

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
    Date d=new Date();
    SimpleDateFormat df= new SimpleDateFormat("dd MM yyyy");
    System.out.println(df.format(d));


  }
}
