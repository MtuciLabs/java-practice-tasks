package lesson02.part01;

/**
 * Напиши код метода addTenPercent, который увеличивает переданное целое число на 10%.
 * Для возврата результата из метода addTenPercent используй оператор return. Пример:
 * return 123 * 435;
 * <p>
 * <p>
 * Требования:
 * 1.	Метод addTenPercent должен увеличивать переданное число на 10% процентов.
 * 2.	Метод main должен вызывать метод addTenPercent.
 * 3.	Метод main должен выводить результаты вызова на экран.
 * 4.	Метод addTenPercent не должен ничего выводить на экран.
 */

public class Task04 {
    public static double addTenPercent(int i) {
        double c=i+(i*0.1);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
