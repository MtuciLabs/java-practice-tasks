package lesson02.part02;

/**
 * Напишите метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.
 * Пример для номера месяца 2:
 * зима
 * Пример для номера месяца 5:
 * весна
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст на экран.
 * 2.	Метод main не должен вызывать функцию System.out.println или System.out.print.
 * 3.	Метод main должен вызывать метод checkSeason.
 * 4.	Метод checkSeason должен быть static void, и иметь только один параметр int.
 * 5.	Метод checkSeason должен выводить текст на экран согласно заданию.
 */
public class Task11 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int month) {
        {
            if (month>11)
                if (month<=12)
                    System.out.println("зима");
        }
        {
            if (month>2)
                if (month<=5)
                    System.out.println("весна");
        }
        {
            if (month>5)
                if (month<=8)
                    System.out.println("лето");
        }
        {
            if (month>8)
                if (month<=11)
                    System.out.println("осень");
        }
        if (month>12)
            if (month<12)
                System.out.println("ошибка");
            else
                System.out.println("зима");  //напишите тут ваш код
    }
}