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
        String s="Мама";
        String s1="Мыла";
        String s2="Раму";
        System.out.println(s+s1+s2);
        System.out.println(s+s2+s1);
        System.out.println(s1+s+s2);
        System.out.println(s1+s2+s);
        System.out.println(s2+s1+s);
        System.out.println(s2+s2+s);


    }
}
