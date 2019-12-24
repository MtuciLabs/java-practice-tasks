package lesson02.part01;

/**
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 6 строк.
 * 3.	Текст в каждой строке должен быть уникален.
 * 4.	Должны быть выведены все возможные комбинации.
 */

public class Task12 {
    public static void main(String[] args) {
        String a1 = "Мама";
        String a2 = "Мыла";
        String a3 = "Раму";

        System.out.println(a1+a2+a3);
        System.out.println(a1+a3+a2);
        System.out.println(a2+a1+a3);
        System.out.println(a2+a1+a1);
        System.out.println(a3+a1+a2);
        System.out.println(a3+a2+a1);

    }
}
