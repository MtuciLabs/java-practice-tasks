package lesson02.part02;

/**
 * Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
 * Если введенное число равно нулю, необходимо вывести ноль.
 * Вывести результат на экран.
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна считывать число c клавиатуры.
 * 2.	Программа должна выводить число на экран.
 * 3.	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
 * 4.	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
 * 5.	Если введенное число равно нулю, необходимо вывести ноль.
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
public class Task12 {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String as = bufferedReader.readLine();
        int a = Integer.parseInt(as);
        if (a>0) {
            System.out.println(a * 2);
        }else{
            if (a<0) {
                System.out.println(a + 1);
            }else{
                if (a==0){
                    System.out.println(0);
                }
            }
        }  //напишите тут ваш код
    }
}